package com.example.doctor.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchDTO {

    private String symptomList;
    private String diseaseList;
    private String diseaseIds;

}
