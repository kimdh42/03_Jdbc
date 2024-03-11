package com.teamproject.config;


import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("********** 메뉴 **********");
        System.out.println("1. 손님 입장");          //insert
        System.out.println("2. 집가기");            //delete
        System.out.println("3. 이용권 양도");        //update
        System.out.println("4. 놀이공원 폐장");
        int num = sc.nextInt();
    }
}
