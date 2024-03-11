package com.ohgiraffers.section03.delete;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        /* entry key = deleteMenu */

        /* 1. 삭제할 메뉴 코드 입력받기 */
        Scanner sc = new Scanner(System.in);

        System.out.print("삭제할 메뉴의 코드를 입력하세요 : ");
        int menuCode = sc.nextInt();

        /* 2. DeleteController의 deleteMenu() 메소드 호출 */
        DeleteController controller = new DeleteController();
        int result = controller.deleteMenu(menuCode);

        /* 3. delete 결과에 따라 성공이면 "메뉴 삭제 성공!" 실패이면 '메뉴 삭제 실패 ㅜㅜ' 출력 */
        if(result > 0) {
            System.out.println("메뉴 삭제 성공!");
        } else {
            System.out.println("메뉴 삭제 실패 ㅜㅜ");
        }
    }
}
