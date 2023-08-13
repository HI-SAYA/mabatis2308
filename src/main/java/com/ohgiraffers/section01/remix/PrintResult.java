package com.ohgiraffers.section01.remix;

import com.ohgiraffers.section01.common.PlayerDTO;
import com.ohgiraffers.section01.common.TeamDTO;

import java.util.List;

public class PrintResult {

    public void printTeamList(List<TeamDTO> teamList) {

        teamList.forEach(System.out::println);
    }

    public void printPlayerList(List<PlayerDTO> playerList) {
        playerList.forEach(System.out::println);
    }


    public void printErrorMessage(String errorCode) {
        String errorMessage = " ";
        switch(errorCode) {
            case "selectList" : errorMessage = "목록 조회에 실패하였습니다."; break;
            case "selectone" : errorMessage = "목록 조회에 실패하였습니다."; break;
            case "insert" : errorMessage = "선수 등록에 실패하였습니다."; break;
            case "update" : errorMessage = "선수 수정에 실패하였습니다."; break;
            case "delete" : errorMessage = "선수 삭제에 실패하였습니다."; break;
        }
        System.out.println(errorMessage);
    }


    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch(successCode) {
            case "insert" : successMessage = "신규 메뉴 등록이 완료 되었습니다."; break;
            case "update" : successMessage = "메뉴 수정이 완료 되었습니다."; break;
            case "delete" : successMessage = "메뉴 삭제가 완료 되었습니다."; break;
        }
        System.out.println(successMessage);
    }
}


