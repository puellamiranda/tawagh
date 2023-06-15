package com.example.taw;

import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class TestApi {

    @Autowired
    private StudiaDatabase studiaDatabase;

    @GetMapping("test")
    public String testApi() {
        return "test";
    }

    @PostMapping(value = "studia", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void addNewStudia(@RequestBody Studia element) {
        studiaDatabase.addStudia(element);
    }

    @GetMapping(value = "studia", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Studia> getStudia(
            @Nullable @RequestParam("przedmiot") String przedmiot,
            @Nullable @RequestParam("ects") Integer ects,
            @Nullable @RequestParam("sala") Integer sala,
            @Nullable @RequestParam("egzamin") String egzamin) {
        Boolean convertedEgzamin = convertEgzaminStringToBoolean(egzamin);
        return studiaDatabase.getStudiaList(przedmiot, ects, sala, convertedEgzamin);
    }

    @GetMapping(value = "studia/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getStudiaById(@PathVariable("id") Integer id) {
        Studia studia = studiaDatabase.getStudiaById(id);
        if (studia == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(studia);
        }
    }

    @DeleteMapping(value = "studia/{id}")
    public ResponseEntity deleteById(@PathVariable("id") Integer id) {
        boolean isDeleted = studiaDatabase.deleteById(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(value = "studia")
    public void deleteAll() {
        studiaDatabase.deleteAll();
    }

    private Boolean convertEgzaminStringToBoolean(String egzamin) {
        if (egzamin != null) {
            if (egzamin.equalsIgnoreCase("tak")) {
                return true;
            } else if (egzamin.equalsIgnoreCase("nie")) {
                return false;
            }
        }
        return null;
    }
}