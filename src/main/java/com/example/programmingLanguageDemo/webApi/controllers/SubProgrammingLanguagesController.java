package com.example.programmingLanguageDemo.webApi.controllers;

import com.example.programmingLanguageDemo.Entities.concretes.SubProgrammingLanguage;
import com.example.programmingLanguageDemo.business.abstracts.SubProgrammingLanguageService;
import com.example.programmingLanguageDemo.business.responses.GetAllSubProgrammingLanguageResponse;
import com.example.programmingLanguageDemo.business.responses.GetByIdSubProgrammingLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/subprogramminglanguages")
public class SubProgrammingLanguagesController {

    private final SubProgrammingLanguageService subProgrammingLanguageService;

    @Autowired
    public SubProgrammingLanguagesController(SubProgrammingLanguageService subProgrammingLanguageService) {
        this.subProgrammingLanguageService = subProgrammingLanguageService;
    }

    @GetMapping("/getallsub")
    public List<GetAllSubProgrammingLanguageResponse> getAllSubProgrammingLanguages() {
        return subProgrammingLanguageService.getAllSubProgrammingLanguages();
    }

    @GetMapping("/getbyidsub/{id}")
    public GetByIdSubProgrammingLanguageResponse subProgrammingLanguageResponse(@PathVariable int id) {
        return subProgrammingLanguageService.getSubProgrammingLanguageById(id);
    }
}