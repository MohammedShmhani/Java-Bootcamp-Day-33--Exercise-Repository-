package com.example.usersmanagement.Controller;

import com.example.usersmanagement.Api.ApiResponse;
import com.example.usersmanagement.Model.User;
import com.example.usersmanagement.Service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/USER")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    //    Get all the Users
    @GetMapping("/GET")
    public ResponseEntity<?> getUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }

    //     Add new User
    @PostMapping("/ADD")
    public ResponseEntity<?> addUser(@Valid @RequestBody User user, Errors errors) {
        if (errors.hasErrors()) {
            return ResponseEntity.badRequest().body(errors.getFieldError().getDefaultMessage());
        }
        userService.addUser(user);
        return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse("User has been successfully added"));
    }

    //• Update User
    @PutMapping("/UPDATE/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Integer id, @Valid @RequestBody User user, Errors errors) {
        if (errors.hasErrors()) {
            return ResponseEntity.badRequest().body(errors.getFieldError().getDefaultMessage());
        }
        userService.updateUser(id, user);
        return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse("User has been successfully updated"));
    }

    //• Delete User
    @DeleteMapping("/DELETE")
    public ResponseEntity<?> deleteUser(Integer id) {
        userService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse("User has been successfully deleted"));
    }

    //• Check if username and password are correct
    @GetMapping("/{username}/{password}")
    public ResponseEntity<?> checkUsernameAndPasswordAreCorrect(@PathVariable String username, @PathVariable String password) {
        userService.checkUsernameAndPasswordAreCorrect(username, password);
        return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse("User has been successfully Enrolled"));
    }

    //• Get user by email
    @GetMapping("/USER/EMAIL/{email}")
    public ResponseEntity<?> getUserByEmail(@PathVariable String email) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUserByEmail(email));
    }

    //• Get All users with specific role
    @GetMapping("/USERS/ROLE/{role}")
    public ResponseEntity<?> getUsersByRole(@PathVariable String role) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUsersByRole(role));
    }

    //• Get All users with specific Age or above
    @GetMapping("/USERS/AGE/ABOVE/{age}")
    public ResponseEntity<?> getUsersByAgeOrAbove(@PathVariable Integer age) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUsersByAgeOrAbove(age));
    }


}
