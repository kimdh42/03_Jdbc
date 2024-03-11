package com.one.comparator;

import com.one.model.dto.PersonDTO;

import java.util.Comparator;

public class AscHeight implements Comparator <PersonDTO> {

    @Override
    public int compare(PersonDTO o1, PersonDTO o2) {
        int result = 0;

        if (o1.getHeight() > o2.getHeight()) {
            result = 1;
        } else if (o1.getHeight() < o2.getHeight()) {
            result = -1;
        } else {
            result = 0;
        }
        return result;

    }
}
