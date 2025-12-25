package com.project.resumebuilder.repository;

import com.project.resumebuilder.document.Resume;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResumeRepository extends MongoRepository<Resume, String> {
}
