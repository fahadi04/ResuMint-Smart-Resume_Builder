package com.project.resumebuilder.controller;

import com.project.resumebuilder.document.Resume;
import com.project.resumebuilder.dto.CreateResumeRequest;
import com.project.resumebuilder.service.ResumeService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import static com.project.resumebuilder.Utils.AppConstants.*;

@RestController
@RequestMapping(RESUME)
@RequiredArgsConstructor
@Slf4j
public class ResumeController {

    private final ResumeService resumeService;

    @PostMapping
    public ResponseEntity<?> createResume(@Valid @RequestBody CreateResumeRequest request, Authentication authentication) {
        // Step 1: Call the service method
        Resume newResume = resumeService.createResume(request, authentication.getPrincipal());

        // Step 2: Return response
        return ResponseEntity.status(HttpStatus.CREATED).body(newResume);
    }

    @GetMapping
    public ResponseEntity<?> getUserResumes() {
        return null;
    }

    @GetMapping(ID)
    public ResponseEntity<?> getResumeById(@PathVariable String id) {
        return null;
    }

    @PutMapping(ID)
    public ResponseEntity<?> updatedResume(@PathVariable String id, @RequestBody Resume updatedData) {
        return null;
    }

    @PutMapping(UPLOAD_IMAGES)
    public ResponseEntity<?> uploadResumeImages(@PathVariable String id,
                                                @RequestPart(value = "thumbnail", required = true) MultipartFile thumbnail,
                                                @RequestPart(value = "profileImage", required = false) MultipartFile profileImage,
                                                HttpServletRequest request) {
        return null;
    }

    @DeleteMapping(ID)
    public ResponseEntity<?> deleteResume(@PathVariable String id) {
        return null;
    }
}
