package com.example.programmingLanguageDemo.webApi.controllers;

import com.example.programmingLanguageDemo.Entities.concretes.ProgrammingLanguage;
import com.example.programmingLanguageDemo.business.abstracts.ProgrammingLanguageService;
import com.example.programmingLanguageDemo.business.responses.GetAllProgrammingLanguagesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    public List<GetAllProgrammingLanguagesResponse> getAll() {
        return programmingLanguageService.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public ProgrammingLanguage getById(@PathVariable int id) {
        return programmingLanguageService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody ProgrammingLanguage programmingLanguage) {
        programmingLanguageService.add(programmingLanguage);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable int id, @RequestBody ProgrammingLanguage programmingLanguage) {
        programmingLanguageService.update(id, programmingLanguage);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        programmingLanguageService.delete(id);
    }
}
