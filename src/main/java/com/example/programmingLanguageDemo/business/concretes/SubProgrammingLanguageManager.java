package com.example.programmingLanguageDemo.business.concretes;

import com.example.programmingLanguageDemo.Entities.concretes.SubProgrammingLanguage;
import com.example.programmingLanguageDemo.business.abstracts.SubProgrammingLanguageService;
import com.example.programmingLanguageDemo.business.responses.GetAllSubProgrammingLanguageResponse;
import com.example.programmingLanguageDemo.business.responses.GetByIdSubProgrammingLanguageResponse;
import com.example.programmingLanguageDemo.dataAccess.abstracts.SubProgrammingLanguageRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubProgrammingLanguageManager implements SubProgrammingLanguageService {

    private final SubProgrammingLanguageRepository subProgrammingLanguageRepository;


    public SubProgrammingLanguageManager(SubProgrammingLanguageRepository subProgrammingLanguageRepository) {
        this.subProgrammingLanguageRepository = subProgrammingLanguageRepository;
    }

    @Override
    public List<GetAllSubProgrammingLanguageResponse> getAllSubProgrammingLanguages() {
        List<SubProgrammingLanguage> subProgrammingLanguages = subProgrammingLanguageRepository.findAll();
        List<GetAllSubProgrammingLanguageResponse> getAllSubProgrammingLanguageResponses = new ArrayList<GetAllSubProgrammingLanguageResponse>();

        for(SubProgrammingLanguage subProgrammingLanguage: subProgrammingLanguages){
            GetAllSubProgrammingLanguageResponse responseItem = new GetAllSubProgrammingLanguageResponse();

            responseItem.setId(subProgrammingLanguage.getId());
            responseItem.setName(subProgrammingLanguage.getName());

            getAllSubProgrammingLanguageResponses.add(responseItem);
        }

        return getAllSubProgrammingLanguageResponses;
    }

    @Override
    public GetByIdSubProgrammingLanguageResponse getSubProgrammingLanguageById(int id) {
        SubProgrammingLanguage subProgrammingLanguage = subProgrammingLanguageRepository.findById(id).get();
        GetByIdSubProgrammingLanguageResponse responseItem = new GetByIdSubProgrammingLanguageResponse();

        responseItem.setName(subProgrammingLanguage.getName());

        return responseItem;
    }

    @Override
    public void createSubProgrammingLanguage(SubProgrammingLanguage subProgrammingLanguage) {
        SubProgrammingLanguage newSubProgrammingLanguage = new SubProgrammingLanguage();
        newSubProgrammingLanguage.setName(subProgrammingLanguage.getName());
        subProgrammingLanguageRepository.save(newSubProgrammingLanguage);
    }

    @Override
    public void deleteSubProgrammingLanguage(int id) {
        subProgrammingLanguageRepository.deleteById(id);
    }

    @Override
    public void updateSubProgrammingLanguage(int id, SubProgrammingLanguage subProgrammingLanguage) {

    }
}
