package com.example.programmingLanguageDemo.business.abstracts;

import com.example.programmingLanguageDemo.Entities.concretes.SubProgrammingLanguage;
import com.example.programmingLanguageDemo.business.requests.CreateProgrammingLanguageRequest;
import com.example.programmingLanguageDemo.business.requests.CreateSubProgrammingLanguageRequest;
import com.example.programmingLanguageDemo.business.requests.UpdateProgrammingLanguageRequest;
import com.example.programmingLanguageDemo.business.responses.GetAllProgrammingLanguagesResponse;
import com.example.programmingLanguageDemo.business.responses.GetAllSubProgrammingLanguageResponse;
import com.example.programmingLanguageDemo.business.responses.GetByIdProgramminLanguageResponse;
import com.example.programmingLanguageDemo.business.responses.GetByIdSubProgrammingLanguageResponse;

import java.util.List;

public interface SubProgrammingLanguageService {
    List<GetAllSubProgrammingLanguageResponse> getAllSubProgrammingLanguages();

    GetByIdSubProgrammingLanguageResponse getSubProgrammingLanguageById(int id);

    void createSubProgrammingLanguage(CreateSubProgrammingLanguageRequest createSubProgrammingLanguageRequest);

    void deleteSubProgrammingLanguage(int id);

    void updateSubProgrammingLanguage(int id, SubProgrammingLanguage subProgrammingLanguage);
}
