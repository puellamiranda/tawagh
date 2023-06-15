package com.example.taw;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class StudiaDatabase {

    private List<Studia> studiaList = new ArrayList<>();
    private int studiaCounter = 1;

    public void addStudia(Studia element) {
        element.setId(studiaCounter);
        convertEgzaminStringToBoolean(element.getEgzamin());
        studiaList.add(element);
        studiaCounter++;
    }

    public List<Studia> getStudiaList() {
        return studiaList;
    }

    public Studia getStudiaById(Integer id) {
        for (Studia element : studiaList) {
            if (element.getId().equals(id)) {
                return element;
            }
        }
        return null;
    }

    public List<Studia> getStudiaList(String przedmiot, Integer ects, Integer sala, Boolean egzamin) {
        if (przedmiot == null && ects == null && sala == null && egzamin == null) {
            return studiaList;
        }
        List<Studia> filteredStudia = new ArrayList<>();
        for (Studia element : studiaList) {
            if (egzamin == null && element.getSala().equals(sala)) {
                filteredStudia.add(element);
            } else if (sala == null && egzamin.equals(element.getEgzamin())) {
                filteredStudia.add(element);
            } else if (element.getSala().equals(sala) && egzamin.equals(element.getEgzamin())) {
                filteredStudia.add(element);
            }
        }
        return filteredStudia;
    }

    private void convertEgzaminStringToBoolean(Boolean egzamin) {
        if (egzamin != null) {
            if (egzamin) {
                egzamin = true;
            } else {
                egzamin = false;
            }
        }
    }

    public void deleteAll() {
        studiaList.clear();
    }

    public boolean deleteById(Integer id) {
        Studia toDelete = null;
        for (Studia element : studiaList) {
            if (element.getId().equals(id)) {
                toDelete = element;
                break;
            }
        }
        if (toDelete != null) {
            studiaList.remove(toDelete);
            return true;
        }
        return false;
    }
}