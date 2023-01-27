package com.example.programmingLanguageDemo.business.responses;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetAllSubProgrammingLanguageResponse {
    private int id;
    private String name;

    private String programmingLanguageName;
}
