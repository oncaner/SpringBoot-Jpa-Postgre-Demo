package com.example.programmingLanguageDemo.dataAccess.abstracts;

import com.example.programmingLanguageDemo.Entities.concretes.SubProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubProgrammingLanguageRepository extends JpaRepository<SubProgrammingLanguage,Integer> {
}
