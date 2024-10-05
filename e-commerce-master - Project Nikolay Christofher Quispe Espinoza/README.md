
<p align="center">
<a href="https://www.linkedin.com/in/soriamaximilianorodrigo/" target="_blank" rel="noopener noreferrer">
<img width="100%" height="100%" src="docs/img/banner.gif" alt="Linkedin"></a></p>



<p align="center">
  <a href="#"><img src="https://img.shields.io/badge/arquitectua-hexagonal-brightgreen" alt="Knime"></a>
  <a href="#"><img src="https://img.shields.io/badge/Chat-on%20Discord-7289da.svg?sanitize=true" alt="Chat"></a>
  <a href="#"><img src="https://img.shields.io/badge/java-17" alt="ETL"></a>

<p align="center">
<a href="https://www.linkedin.com/in/soriamaximilianorodrigo/" target="_blank" rel="noopener noreferrer"></a>


<br/>
<br/>


<p align="center">
<br>


### ⭐ Arquitectura Hexagonal?

La arquitectura hexagonal, también conocida como "arquitectura de puertos y adaptadores," es un enfoque de diseño de software que promueve la separación de las preocupaciones y facilita la mantenibilidad, escalabilidad y pruebas de aplicaciones. En esta guía, exploraremos los conceptos clave de la arquitectura hexagonal y cómo implementarla en tus proyectos.<br>

### ⭐ Curso de Udemy

Estos ejemplo esta dados por el curso de Udemy **Proyecto Ecommerce con Spring Boot y Arquitectura Hexagonal**


Link: https://www.udemy.com/course/proyecto-ecommerce-con-spring-boot-y-arquitectura-hexagonal



#### Objetivo

- Configurar un entorno para desarrollar aplicaciones web con Spring Boot

- Entender, estructurar arquitectura hexagonal en un proyecto Spring Boot

- Usar el motor de plantillas Thymeleaf para la vista en proyectos Spring Boot

- Implementar Spring Data JPA para persistir información en una base de datos PostgreSql

- Implementar autenticación y autorización con Spring Security

- Como llevar un proyecto real usando buenas prácticas de programación

![Arquitectura Hexagonal](docs/arquitectura.png)

### ⭐  Docker

```sh
docker run --name haxagonal-ecommerce -e POSTGRES_PASSWORD=1q2w3e4r -d -p 5432:5432 postgres
```


### ⭐  ¿Qué es la Arquitectura Hexagonal?

La arquitectura hexagonal se basa en el principio de que una aplicación se puede dividir en tres capas principales: la capa de dominio, la capa de aplicación y la capa de infraestructura.

- **Capa de Dominio:** Contiene la lógica central de la aplicación, incluyendo reglas de negocio, entidades y valor de objetos. Esta capa es independiente de la capa de infraestructura y las tecnologías utilizadas.

- **Capa de Aplicación:** Actúa como un intermediario entre la capa de dominio y la capa de infraestructura. Aquí se definen los casos de uso y se orquesta la interacción entre los diferentes componentes.

- **Capa de Infraestructura:** Maneja los detalles técnicos y la interacción con recursos externos, como bases de datos, servicios web, y sistemas externos.

### ⭐  Principales Características

La arquitectura hexagonal presenta las siguientes características clave:

- **Desacoplamiento:** Las capas están altamente desacopladas, lo que facilita cambios en una capa sin afectar a las demás. Esto mejora la mantenibilidad y la flexibilidad del sistema.

- **Pruebas Unitarias:** Al separar claramente las capas, es más fácil realizar pruebas unitarias y pruebas de integración. Esto garantiza la calidad del software.

- **Reutilización:** La lógica de negocio central se encuentra en la capa de dominio, lo que permite reutilizarla en diferentes interfaces de usuario o canales de comunicación.

### ⭐  Implementación

Para implementar la arquitectura hexagonal en tu proyecto, sigue estos pasos:

1. Define la capa de dominio con tus entidades, objetos de valor y reglas de negocio.

2. Crea la capa de aplicación para definir los casos de uso y las interacciones entre la capa de dominio y la capa de infraestructura.

3. En la capa de infraestructura, implementa los adaptadores para la interacción con bases de datos, servicios externos y otros recursos.

4. Usa inyección de dependencias para conectar las capas y asegurarte de que la capa de aplicación pueda acceder a los servicios de infraestructura necesarios.

### ⭐  Ejemplo de Estructura de Directorios

```plaintext
|-- my-app/
    |-- src/
        |-- main/
            |-- java/
                |-- application/       # Capa de Aplicación
                |-- domain/            # Capa de Dominio
                |-- infrastructure/    # Capa de Infraestructura
```


# Dependencias

| Group ID                        | Version | Artifact                      | Scope   |
|---------------------------------|---------|--------------------------------|---------|
| org.springframework.boot        | ![Spring Boot Starter Data JPA](https://img.shields.io/maven-central/v/org.springframework.boot/spring-boot-starter-data-jpa.svg) | spring-boot-starter-data-jpa |         |
| org.springframework.boot        | ![Spring Boot Starter Web](https://img.shields.io/maven-central/v/org.springframework.boot/spring-boot-starter-web.svg) | spring-boot-starter-web |         |
| org.springframework.boot        | ![Spring Boot DevTools](https://img.shields.io/maven-central/v/org.springframework.boot/spring-boot-devtools.svg) | spring-boot-devtools | runtime |
| org.postgresql                 | ![PostgreSQL](https://img.shields.io/maven-central/v/org.postgresql/postgresql.svg) | postgresql | runtime |
| org.mapstruct                  | ![MapStruct](https://img.shields.io/maven-central/v/org.mapstruct/mapstruct.svg) | mapstruct |         |
| org.projectlombok              | ![Lombok](https://img.shields.io/maven-central/v/org.projectlombok/lombok.svg) | lombok |         |
| org.projectlombok              | ![Lombok MapStruct Binding](https://img.shields.io/maven-central/v/org.projectlombok/lombok-mapstruct-binding.svg) | lombok-mapstruct-binding |         |
| org.springframework.boot        | ![Spring Boot Starter Test](https://img.shields.io/maven-central/v/org.springframework.boot/spring-boot-starter-test.svg) | spring-boot-starter-test | test    |


# Dominio

### Product
| Atributo        | Tipo              |
|-----------------|-------------------|
| id              | Integer           |
| code            | String            |
| name            | String            |
| description     | String            |
| image           | String            |
| price           | BigDecimal         |
| dateCreated     | LocalDateTime      |
| dateUpdated     | LocalDateTime      |
| user            | User              |

### User

| Atributo        | Tipo              |
|-----------------|-------------------|
| id              | Integer           |
| username        | String            |
| firstName       | String            |
| lastName        | String            |
| email           | String            |
| address         | String            |
| cellphone       | String            |
| password        | String            |
| userType        | UserType          |
| dateCreated     | LocalDateTime      |



### UserType

| Valor  | Descripción  |
|------- |------------- |
| ADMIN  | Administrador |
| USER   | Usuario      |

### ⭐ Certificado


<p align="center">
<a href="https://www.udemy.com/certificate/UC-8af58d48-0983-4c1e-95b8-9b854f95c220/" target="_blank" rel="noopener noreferrer">
<img width="100%" height="100%" src="docs/img/certificado.jpg" alt="Linkedin"></a></p>

> [!NOTE]
> Puedes entrar al certificado dando clic sobre el la imagen.
---

<br/>


### ⭐ Autor
<br>

> ‍💻 **Nombre:** Maximiliano Rodrigo Soria
>
> 📧 **Email:** MaximilianoRodrigoSoria@gmail.com
>
> 🏠 **De:** Florencio Varela, Alpino
>
> 💼 **Linkedin:** [SoriaMaximilianoRodrigo](https://www.linkedin.com/in/soriamaximilianorodrigo/)
>
> 💬 **Chatear:**  [Inicia un chat](https://wa.me/1127043256) 
>
> 📝 **CV:** [Link](https://www.canva.com/design/DAFxIt0xaNQ/tKTSodPQyHett1abRieMyw/view?utm_content=DAFxIt0xaNQ&utm_campaign=designshare&utm_medium=link&utm_source=publishsharelink)
