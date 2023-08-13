package com.ohgiraffers.section01.remix;

import com.ohgiraffers.section01.common.SearchCriteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do {
            System.out.println("========== 메뉴 관리 ==========");
            System.out.println("1. 팀 / 선수 전체 정보 조회");
            System.out.println("2. 조건에 따라 조회");
            System.out.println("3. 신규 선수 등록");
            System.out.println("4. 선수 정보 수정");
            System.out.println("5. 선수 정보 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.print("선택할 메뉴 입력 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1: selectInfo(); break;
                case 2: SubMenu(); break;
                case 3: menuController.registPlayer(inputPlayer()); break;
                case 4: menuController.modifyPlayer(inputModifyPlayer()); break;
                case 5: menuController.deletePlayer(inputDeletePlayer()); break;
                case 9:
                    System.out.println("프로그램을 종료합니다."); return;
            }
        } while (true);
    }



    // --------------------------------------------- 메인 -------------------------

    private static void selectInfo() {
        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do {
            System.out.println("========== 팀 / 선수 정보 조회 ==========");
            System.out.println("1. 팀 전체 정보 조회");
            System.out.println("2. 선수 전체 정보 조회");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 번호를 선택하주세요 : ");
            int no = sc.nextInt();

            switch(no) {
                case 1 : menuController.selectAllTeam(); break;
                case 2 : menuController.selectAllPlayer(); break;
                case 9 : return;
            }
        } while(true);
    }

    // -------------------- 1번 끝 ----
    // -------------------- 2번 시작 if ----

    private static void SubMenu() {
        Scanner sc = new Scanner(System.in);
        MenuService menuService = new MenuService();
        do {
            System.out.println("========== 조건에 따라 조회 ==========");
            System.out.println("1. 팀명 혹은 선수명으로 조회");
            System.out.println("2. 리그별 구단 목록 조회");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : menuService.searchMenu(inputSearchCriteria());
                case 2 : menuService.searchLeague(inputsSupLeague());
                case 9 : return;
            }
        } while (true);
    }


    private static SearchCriteria inputSearchCriteria() {
        Scanner sc = new Scanner(System.in);

        System.out.print("검색 기준을 입력해주세요 ( team / player) : ");
        String condition = sc.nextLine();
        System.out.print("검색어를 입력해주세요 : ");
        String value = sc.nextLine();

        return new SearchCriteria(condition, value);
    }


    private static Map<String, String> inputPlayer() {

        Scanner sc = new Scanner(System.in);

        System.out.print("선수 등번호를 입력하세요 : ");
        String playerNo = sc.nextLine();
        System.out.print("선수 이름을 입력하세요 : ");
        String playerName = sc.nextLine();
        System.out.print("팀 코드 입력하세요 : ");
        String teamCode = sc.nextLine();
        System.out.print("등록될 선수의 팀을 입력하세요 : ");
        String teamName = sc.nextLine();
        System.out.print("등록될 선수의 리그를 입력하세요 : ");
        String leagueName = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("playerNo", playerNo);
        parameter.put("playerName", playerName);
        parameter.put("teamCode", teamCode);
        parameter.put("teamName", teamName);
        parameter.put("leagueName", leagueName);

        return parameter;
    }

    private static Map<String, String> inputModifyPlayer() {

        Scanner sc = new Scanner(System.in);

        System.out.print("수정할 선수의 코드를 입력하세요 : ");
        String playerCode = sc.nextLine();
        System.out.print("수정할 선수 등번호를 입력하세요 : ");
        String playerNo = sc.nextLine();
        System.out.print("수정할 선수 이름을 입력하세요 : ");
        String playerName = sc.nextLine();
        System.out.print("수정할 팀 코드 입력하세요 : ");
        String teamCode = sc.nextLine();
        System.out.print("수정할 선수의 팀을 입력하세요 : ");
        String teamName = sc.nextLine();
        System.out.print("수정할 선수의 리그를 입력하세요 : ");
        String leagueName = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("playerCode", playerCode);
        parameter.put("playerNo", playerNo);
        parameter.put("playerName", playerName);
        parameter.put("teamCode", teamCode);
        parameter.put("teamName", teamName);
        parameter.put("leagueName", leagueName);

        return parameter;

    }

    private static Map<String, String> inputDeletePlayer() {

        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 선수 코드를 입력하세요 : ");
        String playerCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("playerCode", playerCode);

        return parameter;

    }

    private static SearchCriteria inputsSupLeague() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 라리가-2, 분데스리가, 프리미어리그-1, 세리에A, 리그1 ===");
        System.out.println("=== 프리메리아리가, 에레디비시, 벨기에프로리그, 오스트리아분데스리가 ===");
        System.out.print("조회할 리그 명을 입력해주세요 : ");
        String value = sc.nextLine();

        return new SearchCriteria("leagueCode", value);

    }

}
