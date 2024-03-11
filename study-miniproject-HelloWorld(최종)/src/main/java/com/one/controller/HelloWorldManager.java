package com.one.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import com.one.model.dto.PersonDTO;
import com.one.veiw.HelloWorldMenu;
import com.one.comparator.AscHeight;


public class HelloWorldManager {

        PersonDTO personDTO = new PersonDTO();


        private ArrayList<PersonDTO> personList = new ArrayList<>();
        private PersonDTO pDTO = null;

        public void insertPerson (PersonDTO pDTO) {
            personList.add(pDTO);
        }

        public PersonDTO personInfo() {
            return pDTO;
        }

        public void allPrint() {
            Collections.sort(personList, new AscHeight());
            for(PersonDTO person : personList) {
                System.out.println(person);
            }
        }

        public PersonDTO selectPerson(String name) {

            while (true) {
                for (PersonDTO person : personList) {
                    if (person.getName().equals(name)) {
                        System.out.println(person);
                        return person;

                    }
                }
                return null;
            }
        }


        public void goHomePerson(PersonDTO pson1){


            personList.remove(pson1);
        }



}
