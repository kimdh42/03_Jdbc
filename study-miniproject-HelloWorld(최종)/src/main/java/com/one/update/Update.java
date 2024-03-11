package com.one.update;

import com.one.model.jdbcDTO.JdbcDTO;

import java.util.Scanner;

public class Update {
    public void updateWatingTime() {

        Scanner sc = new Scanner(System.in);
        System.out.print("대기시간을 변경 하세요 :");
        String watingTime = sc.nextLine();

        System.out.print("대기시간을 변경할 놀이기구 코드를 입력하세요 : ");
        int rideCode = sc.nextInt();
        sc.nextLine();

        JdbcDTO jdbcDTO = new JdbcDTO();
        jdbcDTO.setWating_time(watingTime);
        jdbcDTO.setRide_code(rideCode);


        UpdateController controller = new UpdateController();
        int result = controller.updateMenu(jdbcDTO);

        if (result > 0) {
        System.out.println("대기 시간이 변경되었습니다.");
        } else {
        System.out.println("대기시간을 다시 입력해 주세요.");
        }
    }

    public void enterRide() {

        Scanner sc = new Scanner(System.in);

        System.out.print("놀이기구 탈 사람의 코드를 입력하세요 : ");
        int entranceCode = sc.nextInt();
        sc.nextLine();

        System.out.print("탈 놀이기구의 입력하세요(회전목마, 자이로드롭 , 바이킹) :");
        String rideSort = sc.nextLine();

        JdbcDTO jdbcDTO = new JdbcDTO();
        jdbcDTO.setEntrance_code(entranceCode);
        jdbcDTO.setRide_sort(rideSort);

        UpdateController controller = new UpdateController();
        int result = controller.updateEntranceCode(jdbcDTO);

        if (result > 0) {
            System.out.println(jdbcDTO.getRide_sort() + "에 줄을 섰습니다");
        } else {
            System.out.println("?? : 다른거 타러갈래~");
        }
    }
}
