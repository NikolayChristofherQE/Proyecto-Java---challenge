package ar.com.laboratory.ecommerce.infrastructure.controller.api;


import ar.com.laboratory.ecommerce.application.service.UserService;
import ar.com.laboratory.ecommerce.infrastructure.controller.api.request.UserRequest;
import ar.com.laboratory.ecommerce.infrastructure.controller.api.response.UserResponse;
import ar.com.laboratory.ecommerce.infrastructure.mapper.UserMapper;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Tag(name = "User", description = "Operations related to users")
@AllArgsConstructor
public class UserRestController {

    private UserService userService;
    private UserMapper mapper;

    @GetMapping("/health")
    public ResponseEntity<String> health(){
        return ResponseEntity
                .ok()
                .body("OK");
    }
    @GetMapping
    @ApiResponse(responseCode = "200", description = "Successful response", content = @Content(schema = @Schema(implementation = UserResponse.class)))
    public ResponseEntity<Iterable<UserResponse>> getProducts(){
        return  ResponseEntity
                .ok()
                .body(mapper.toUsersResponses(userService.getUsers()));
    }
    @GetMapping("/{id}")
    @ApiResponse(responseCode = "200", description = "Successful response", content = @Content(schema = @Schema(implementation = UserResponse.class)))
    public ResponseEntity<UserResponse> getProduct(@PathVariable Integer id){
        return  ResponseEntity
                .ok()
                .body(mapper.userToResponse(userService.getUserById(id)));
    }
    @PostMapping
    public ResponseEntity<UserResponse> save(@RequestBody UserRequest request){
        return ResponseEntity
                .ok()
                .body(mapper.userToResponse(userService.save(mapper.requestToUser(request))));
    }
    @PutMapping
    public ResponseEntity<UserResponse> update(@RequestBody UserRequest request){
        return ResponseEntity
                .ok()
                .body(mapper.userToResponse(userService.save(mapper.requestToUser(request))));
    }
    @DeleteMapping({"/{id}"})
    public ResponseEntity<UserResponse> update(@PathVariable Integer id){
        userService.deleteUser(id);
        return ResponseEntity
                .noContent()
                .build();
    }
}
