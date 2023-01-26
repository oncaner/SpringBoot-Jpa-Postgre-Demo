package com.example.programmingLanguageDemo.business.concretes;

import com.example.programmingLanguageDemo.Entities.concretes.ProgrammingLanguage;
import com.example.programmingLanguageDemo.business.abstracts.ProgrammingLanguageService;
import com.example.programmingLanguageDemo.business.requests.CreateProgrammingLanguageRequest;
import com.example.programmingLanguageDemo.business.requests.UpdateProgrammingLanguageRequest;
import com.example.programmingLanguageDemo.business.responses.GetAllProgrammingLanguagesResponse;
import com.example.programmingLanguageDemo.business.responses.GetByIdProgramminLanguageResponse;
import com.example.programmingLanguageDemo.dataAccess.abstracts.ProgrammingLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private final ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<GetAllProgrammingLanguagesResponse> getAll() {
        List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
        List<GetAllProgrammingLanguagesResponse> getAllProgrammingLanguagesResponses = new ArrayList<GetAllProgrammingLanguagesResponse>();

        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            GetAllProgrammingLanguagesResponse responseItem = new GetAllProgrammingLanguagesResponse();
            responseItem.setId(programmingLanguage.getId());
            responseItem.setName(programmingLanguage.getName());

            getAllProgrammingLanguagesResponses.add(responseItem);
        }

        return getAllProgrammingLanguagesResponses;
    }

    @Override
    public GetByIdProgramminLanguageResponse getById(int id) {

        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id).get();
        GetByIdProgramminLanguageResponse responseItem = new GetByIdProgramminLanguageResponse();
        responseItem.setName(programmingLanguage.getName());

        return responseItem;
    }

    @Override
    public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
        programmingLanguage.setName(createProgrammingLanguageRequest.getName());
        programmingLanguageRepository.save(programmingLanguage);
    }

    @Override
    public void delete(int id) {
        programmingLanguageRepository.deleteById(id);
    }

    @Override
    public void update(int id, UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id).get();
        programmingLanguage.setName(updateProgrammingLanguageRequest.getName());
        programmingLanguageRepository.save(programmingLanguage);
    }
}