package com.project.resumebuilder.service;

import com.project.resumebuilder.document.Resume;
import com.project.resumebuilder.dto.AuthResponse;
import com.project.resumebuilder.dto.CreateResumeRequest;
import com.project.resumebuilder.repository.ResumeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
@Slf4j
public class ResumeService {
    private final ResumeRepository resumeRepository;
    private final AuthService authService;

    public Resume createResume(CreateResumeRequest request, Object principalObject) {
        //Step 1: Create resume object
        Resume newResume = new Resume();

        //Step 2: Get the current profile
        AuthResponse response = authService.getProfile(principalObject);

        //Step 3: Update the resume object
        newResume.setUserId(response.getId());
        newResume.setTitle(request.getTitle());

        //Step 4: Set default data for resume
        setDefaultResumeData(newResume);

        //Step 5: Save the resume data
        return resumeRepository.save(newResume);
    }

    private void setDefaultResumeData(Resume newResume) {
        newResume.setProfileInfo(new Resume.ProfileInfo());
        newResume.setContactInfo(new Resume.ContactInfo());
        newResume.setWorkExperience(new ArrayList<>());
        newResume.setEducation(new ArrayList<>());
        newResume.setSkills(new ArrayList<>());
        newResume.setProjects(new ArrayList<>());
        newResume.setCertifications(new ArrayList<>());
        newResume.setLanguages(new ArrayList<>());
        newResume.setInterests(new ArrayList<>());
    }
}
