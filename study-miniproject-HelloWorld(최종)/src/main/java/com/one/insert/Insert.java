package com.one.insert;

import com.one.model.jdbcDTO.JdbcDTO;

import java.util.Scanner;

public class Insert {

    public void insertMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("입장 코드를 입력해주세요 : ");
        int entranceCode = sc.nextInt();
        System.out.print("티켓 코드를 입력해주세요 : ");
        int ticketCode = sc.nextInt();
        sc.nextLine();
        System.out.print("이름을 입력해 주세요 : ");
        String personName = sc.nextLine();
        System.out.print("나이를 입력해 주세요 : ");
        int personAge = sc.nextInt();
        sc.nextLine();
        System.out.print("성별을 입력해 주세요 : ");
        String personGender = sc.nextLine();
        System.out.print("키를 입력해 주세요 : ");
        double personHeight = sc.nextDouble();


        JdbcDTO jdbcDTO = new JdbcDTO();
        jdbcDTO.setEntrance_code(entranceCode);
        jdbcDTO.setTicket_code(ticketCode);
        jdbcDTO.setPerson_name(personName);
        jdbcDTO.setPerson_age(personAge);
        jdbcDTO.setPerson_gender(personGender);
        jdbcDTO.setPerson_height(personHeight);

        /* InsertController의 insertMenu() 메소드 호출 */
        InsertController controller = new InsertController();
        int result = controller.entrance(jdbcDTO);

        /* insert 결과에 따라서 성공이면 '메뉴 등록 성공!' , 실패이면 '메뉴 등록 실패!' 출력 */
        if (result > 0) {
            System.out.println("입장 인원 등록 성공");
        } else {
            System.out.println("입장 실패 ㄲㅂ");
        }
    }

}
