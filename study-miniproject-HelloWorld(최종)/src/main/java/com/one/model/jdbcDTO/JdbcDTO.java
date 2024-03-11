package com.one.model.jdbcDTO;

public class JdbcDTO {

    private int entrance_code;
    private int ticket_code;
    private String person_name;
    private int person_age;
    private String person_gender;
    private double person_height;
    private String wating_time;
    private int ride_code;
    private String ride_sort;

    public JdbcDTO() {}

    public JdbcDTO(int entrance_code, int ticket_code, String person_name, int person_age, String person_gender,
                   double person_height, String wating_time, String ride_sort) {
        this.entrance_code = entrance_code;
        this.ticket_code = ticket_code;
        this.person_name = person_name;
        this.person_age = person_age;
        this.person_gender = person_gender;
        this.person_height = person_height;
        this.wating_time = wating_time;
        this.ride_sort = ride_sort;
    }

    public String getRide_sort() {
        return ride_sort;
    }

    public void setRide_sort(String ride_sort) {
        this.ride_sort = ride_sort;
    }

    public JdbcDTO(int ride_code) {
        this.ride_code = ride_code;
    }

    public int getRide_code() {
        return ride_code;
    }

    public void setRide_code(int ride_code) {
        this.ride_code = ride_code;
    }

    public String getWating_time() {
        return wating_time;
    }

    public void setWating_time(String wating_time) {
        this.wating_time = wating_time;
    }

    public int getEntrance_code() {
        return entrance_code;
    }

    public void setEntrance_code(int entrance_code) {
        this.entrance_code = entrance_code;
    }

    public int getTicket_code() {
        return ticket_code;
    }

    public void setTicket_code(int ticket_code) {
        this.ticket_code = ticket_code;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public int getPerson_age() {
        return person_age;
    }

    public void setPerson_age(int person_age) {
        this.person_age = person_age;
    }

    public String getPerson_gender() {
        return person_gender;
    }

    public void setPerson_gender(String person_gender) {
        this.person_gender = person_gender;
    }

    public double getPerson_height() {
        return person_height;
    }

    public void setPerson_height(double person_height) {
        this.person_height = person_height;
    }

    @Override
    public String toString() {
        return "JdbcDTO{" +
                "entrance_code=" + entrance_code +
                ", ticket_code=" + ticket_code +
                ", person_name='" + person_name + '\'' +
                ", person_age=" + person_age +
                ", person_gender='" + person_gender + '\'' +
                ", person_height=" + person_height +
                '}';
    }
}
