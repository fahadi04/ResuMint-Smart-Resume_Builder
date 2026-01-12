package com.project.resumebuilder.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterRequestDTO {

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "User email")
    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is required")
    private String email;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "User full name")
    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 15, message = "Name should be between 2 & 15 characters")
    private String name;

    @Schema(requiredMode = Schema.RequiredMode.REQUIRED, description = "User password")
    @NotBlank(message = "Password is required")
    @Size(min = 6, max = 15, message = "Password length should be between 6 & 15 characters")
    private String password;

    @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Optional profile image URL")
    private String profileImageUrl;
}
