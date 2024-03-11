package com.one.model.dto;

    public class MerryGoRound {


        public void merryGoRoundLimit(PersonDTO person) {
            double heightLimit = 120.0;
            if(heightLimit <= person.getHeight()) {
                System.out.println("탑승 할 수 있습니다.");
            }
        }
}
