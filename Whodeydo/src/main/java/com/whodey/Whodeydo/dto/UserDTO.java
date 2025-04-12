package com.whodey.Whodeydo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO {

    private Integer userId;

    @NotNull(message = "Name is required")
    @Size(max = 255, message = "Name should not exceed 255 characters")
    private String name;

    @NotNull(message = "Email is required")
    @Email(message = "Invalid email format")
    @Size(max = 255, message = "Email should not exceed 255 characters")
    private String email;

    @NotNull(message = "Password is required")
    @Size(min = 6, max = 255, message = "Password should be between 6 and 255 characters")
    private String password;

    @Size(max = 20, message = "Phone number should not exceed 20 characters")
    private String phone;

    @Size(max = 255, message = "Location should not exceed 255 characters")
    private String location;

    @Size(max = 255, message = "Profile picture URL should not exceed 255 characters")
    private String profilePicture;

    private String dateJoined;  

}
