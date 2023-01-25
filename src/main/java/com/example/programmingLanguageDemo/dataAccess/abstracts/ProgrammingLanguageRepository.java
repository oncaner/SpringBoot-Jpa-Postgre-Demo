package com.example.programmingLanguageDemo.dataAccess.abstracts;

import com.example.programmingLanguageDemo.Entities.concretes.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {
}
