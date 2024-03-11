package com.one.model.dto;


public class GyroDrop {

    PersonDTO personDTO = new PersonDTO();

    public void gyroDropLimit(PersonDTO person) {
        double heightLimit = 170.0;

        if(heightLimit <= person.getHeight()) {
            System.out.println("탑승 할 수 있습니다.");
        } else {
            System.out.println("회전목마나 타세요");
        }
    }

}
