package com.ohgiraffers.section02.update;

import com.ohgiraffers.model.dto.MenuDTO;

import java.util.Scanner;

public class Application2 {

    /* 1. 변경할 메뉴 코드, 이름, 가격을 입력 받기 */

    /* 2. MenuDTO 객체를 생성하여 입력받은 값으로 setting */

    /* 3. UpdateController의 updateMenu() 메소드 호출 */

    /* 4. update 결과에 따라 성공, 실패 메세지 출력 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("변경할 메뉴의 코드를 입력하세요 : ");
        int menuCode = sc.nextInt();
        System.out.print("변경할 메뉴의 이름을 입력하세요 : ");
        sc.nextLine();
        String menuName = sc.nextLine();
        System.out.print("변경할 메뉴의 가격을 입력하세요 : ");
        int menuPrice = sc.nextInt();

        MenuDTO newMenu = new MenuDTO();

        newMenu.setMenuCode(menuCode);
        newMenu.setMenuName(menuName);
        newMenu.setMenuPrice(menuPrice);

        UpdateController controller = new UpdateController();
        int result = controller.UpdateMenu(newMenu);

        if(result > 0) {
            System.out.println("메뉴 업데이트 성공!");
        } else {
            System.out.println("메뉴 업데이트 실패 ㅜㅜ");
        }
    }
}
