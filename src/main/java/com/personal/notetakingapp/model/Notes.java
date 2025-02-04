package com.personal.notetakingapp.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "notes")
@Getter
@Setter
public class Notes {

    @Id
    private String id;

    private String text;



}
