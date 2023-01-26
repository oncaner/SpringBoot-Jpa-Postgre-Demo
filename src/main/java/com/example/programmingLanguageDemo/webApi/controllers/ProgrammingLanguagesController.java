package com.example.programmingLanguageDemo.webApi.controllers;

import com.example.programmingLanguageDemo.business.abstracts.ProgrammingLanguageService;
import com.example.programmingLanguageDemo.business.requests.CreateProgrammingLanguageRequest;
import com.example.programmingLanguageDemo.business.requests.UpdateProgrammingLanguageRequest;
import com.example.programmingLanguageDemo.business.responses.GetAllProgrammingLanguagesResponse;
import com.example.programmingLanguageDemo.business.responses.GetByIdProgramminLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
    private final ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    public List<GetAllProgrammingLanguagesResponse> getAllProgrammingLanguages() {
        return programmingLanguageService.getAllProgrammingLanguages();
    }

    @GetMapping("/getbyid/{id}")
    public GetByIdProgramminLanguageResponse getProgrammingLanguageById(@PathVariable int id) {
        return programmingLanguageService.getProgrammingLanguageById(id);
    }

    @PostMapping("/add")
    public void createProgrammingLanguage(@RequestBody CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
        programmingLanguageService.createProgrammingLanguage(createProgrammingLanguageRequest);
    }

    @PutMapping("/update/{id}")
    public void updateProgrammingLanguage(@PathVariable int id, @RequestBody UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
        programmingLanguageService.updateProgrammingLanguage(id, updateProgrammingLanguageRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProgrammingLanguage(@PathVariable int id) {
        programmingLanguageService.deleteProgrammingLanguage(id);
    }
}
