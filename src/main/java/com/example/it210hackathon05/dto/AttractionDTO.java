package com.example.it210hackathon05.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Valid
public class AttractionDTO {
    @Size(min = 10,max = 200, message = "Do dai tu 10 den 200 ki tu")
    private String name;

    @NotBlank
    private String location;

//    @Size(value =1.0, value = 5.0,message = "Gia tri nhap tu 1.0 den 5.0")
    private Double rating;
}
