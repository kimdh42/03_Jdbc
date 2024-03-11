package com.one.delete;

import com.one.model.jdbcDTO.JdbcDTO;

import java.util.Scanner;

public class Delete {
    public void goHomePesson() {

        Scanner sc = new Scanner(System.in);
        System.out.print("집에 갈 사람을 선택해 주세요 : ");
        int entranceCode = sc.nextInt();

        JdbcDTO jdbcDTO = new JdbcDTO();
        jdbcDTO.setEntrance_code(entranceCode);

        DeleteController controller = new DeleteController();
        int result = controller.goHome(jdbcDTO);

        if(result > 0 ){
            System.out.println("다음에 또 이용해 주세요 안전귀가!!");
        }else {
            System.out.println("?? : 아직 더 놀아야 해!!!! ");
        }
    }
}
