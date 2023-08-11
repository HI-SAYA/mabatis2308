package com.ohgiraffers.section01.remix;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do {
            System.out.println("========== 메뉴 관리 ==========");
            System.out.println("1. 선수 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("선택할 메뉴 입력 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 :
                    menuController.selectAllPlayer(); break;
            }
        } while(true);
    }
}
