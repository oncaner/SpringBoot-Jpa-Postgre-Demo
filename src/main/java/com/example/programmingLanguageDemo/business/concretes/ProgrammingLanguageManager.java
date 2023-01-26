package com.example.programmingLanguageDemo.business.concretes;

import com.example.programmingLanguageDemo.Entities.concretes.ProgrammingLanguage;
import com.example.programmingLanguageDemo.business.abstracts.ProgrammingLanguageService;
import com.example.programmingLanguageDemo.business.responses.GetAllProgrammingLanguagesResponse;
import com.example.programmingLanguageDemo.dataAccess.abstracts.ProgrammingLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

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
    public ProgrammingLanguage getById(int id) {
        return programmingLanguageRepository.findById(id).get();
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.save(programmingLanguage);
    }

    @Override
    public void delete(int id) {
        programmingLanguageRepository.deleteById(id);
    }

    @Override
    public void update(int id, ProgrammingLanguage newProgrammingLanguage) {
        ProgrammingLanguage programmingLanguage = programmingLanguageRepository.findById(id).get();
        programmingLanguage.setName(newProgrammingLanguage.getName());
        programmingLanguageRepository.save(newProgrammingLanguage);
    }
}