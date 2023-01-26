package com.example.programmingLanguageDemo.business.abstracts;

import com.example.programmingLanguageDemo.Entities.concretes.ProgrammingLanguage;
import com.example.programmingLanguageDemo.business.requests.CreateProgrammingLanguageRequest;
import com.example.programmingLanguageDemo.business.requests.UpdateProgrammingLanguageRequest;
import com.example.programmingLanguageDemo.business.responses.GetAllProgrammingLanguagesResponse;
import com.example.programmingLanguageDemo.business.responses.GetByIdProgramminLanguageResponse;

import java.util.List;

public interface ProgrammingLanguageService {
    List<GetAllProgrammingLanguagesResponse> getAll();

    GetByIdProgramminLanguageResponse getById(int id);

    void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);

    void delete(int id);

    void update(int id, UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);
}
