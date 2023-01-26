package com.example.programmingLanguageDemo.business.abstracts;

import com.example.programmingLanguageDemo.Entities.concretes.ProgrammingLanguage;
import com.example.programmingLanguageDemo.business.responses.GetAllProgrammingLanguagesResponse;

import java.util.List;

public interface ProgrammingLanguageService {
    List<GetAllProgrammingLanguagesResponse> getAll();

    ProgrammingLanguage getById(int id);

    void add(ProgrammingLanguage programmingLanguage);

    void delete(int id);

    void update(int id, ProgrammingLanguage newProgrammingLanguage);
}
