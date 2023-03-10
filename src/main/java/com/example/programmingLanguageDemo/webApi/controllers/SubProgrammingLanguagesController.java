package com.example.programmingLanguageDemo.webApi.controllers;

import com.example.programmingLanguageDemo.Entities.concretes.SubProgrammingLanguage;
import com.example.programmingLanguageDemo.business.abstracts.SubProgrammingLanguageService;
import com.example.programmingLanguageDemo.business.requests.CreateSubProgrammingLanguageRequest;
import com.example.programmingLanguageDemo.business.requests.UpdateSubProgrammingLanguageRequest;
import com.example.programmingLanguageDemo.business.responses.GetAllSubProgrammingLanguageResponse;
import com.example.programmingLanguageDemo.business.responses.GetByIdSubProgrammingLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subprogramminglanguages")
public class SubProgrammingLanguagesController {

    private final SubProgrammingLanguageService subProgrammingLanguageService;

    @Autowired
    public SubProgrammingLanguagesController(SubProgrammingLanguageService subProgrammingLanguageService) {
        this.subProgrammingLanguageService = subProgrammingLanguageService;
    }

    @GetMapping("/getall")
    public List<GetAllSubProgrammingLanguageResponse> getAllSubProgrammingLanguages() {
        return subProgrammingLanguageService.getAllSubProgrammingLanguages();
    }

    @GetMapping("/getbyid/{id}")
    public GetByIdSubProgrammingLanguageResponse subProgrammingLanguageResponse(@PathVariable int id) {
        return subProgrammingLanguageService.getSubProgrammingLanguageById(id);
    }

    @PostMapping("/add")
    public void add(CreateSubProgrammingLanguageRequest createSubProgrammingLanguageRequest) {
        subProgrammingLanguageService.createSubProgrammingLanguage(createSubProgrammingLanguageRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        subProgrammingLanguageService.deleteSubProgrammingLanguage(id);
    }

    @PutMapping("update/{id}")
    public void update(@PathVariable int id, @RequestBody UpdateSubProgrammingLanguageRequest updateSubProgrammingLanguageRequest) {
        subProgrammingLanguageService.updateSubProgrammingLanguage(id, updateSubProgrammingLanguageRequest);
    }
}
