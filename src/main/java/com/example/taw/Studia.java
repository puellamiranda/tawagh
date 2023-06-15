package com.example.taw;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@JsonSerialize
@Data
public class Studia {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("przedmiot")
    private String przedmiot;

    @JsonProperty("ects")
    private Integer ects;

    @JsonProperty("sala")
    private Integer sala;

    @JsonProperty("egzamin")
    private Boolean egzamin;
}