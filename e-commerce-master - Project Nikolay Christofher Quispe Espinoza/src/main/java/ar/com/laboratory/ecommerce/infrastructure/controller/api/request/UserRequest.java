package ar.com.laboratory.ecommerce.infrastructure.controller.api.request;

import ar.com.laboratory.ecommerce.domain.UserType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class UserRequest {
    @Schema(description = "Username of the user")
    private String username;

    @Schema(description = "First name of the user")
    private String firstName;

    @Schema(description = "Last name of the user")
    private String lastName;

    @Schema(description = "Email address of the user")
    private String email;

    @Schema(description = "Address of the user")
    private String address;

    @Schema(description = "Cellphone number of the user")
    private String cellphone;

    @Schema(description = "Password of the user (hashed or encrypted)")
    private String password;

    @Schema(description = "Type of user (e.g., admin, regular)")
    private UserType userType;

    @Schema(description = "Date the user was created")
    private LocalDateTime dateCreated;

}