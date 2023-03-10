package com.example.programmingLanguageDemo.business.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateSubProgrammingLanguageRequest {
    private String name;
    private int programmingLanguageId;
}
