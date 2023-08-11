package com.ohgiraffers.section01.remix;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do {
            System.out.println("========== 메뉴 관리 ==========");
            System.out.println("1. 팀 / 선수 정보 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("선택할 메뉴 입력 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1: selectInfo(); break;
                default:
                    System.out.println("잘못 된 메뉴를 선택하셨습니다.");
            }
        } while (true);
    }

    private static void selectInfo() {
        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do {
            System.out.println("========== 팀 / 선수 정보 조회 ==========");
            System.out.println("1. 전체 팀 정보 조회");
            System.out.println("2. 전체 선수 정보 조회");
            System.out.println("3. 팀명 혹은 선수명으로 조회");
            System.out.print("메뉴를 선택하주세요 : ");
            int no = sc.nextInt();
            switch(no) {
                case 1 : menuController.selectAllTeam(); break;
                case 2 : menuController.selectAllPlayer(); break;
                case 3 : menuController.searchName(inputSearchCriteria()); break;
            }
        } while(true);
    }

    private static SearchCriteria inputSearchCriteria() {
        Scanner sc = new Scanner(System.in);

        System.out.print("검색 기준을 입력해주세요 ( team / player) : ");
        String condition = sc.nextLine();
        System.out.print("검색어를 입력해주세요 : ");
        String value = sc.nextLine();

        return new SearchCriteria(condition, value);
    }
}
