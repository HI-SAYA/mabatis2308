package com.ohgiraffers.section01.remix;

import java.util.List;

public class PrintResult {
    public void printMenuList(List<PlayerDTO> playerList) {
        playerList.forEach(System.out::println);
    }

    public void printMenu(PlayerDTO player) {
        System.out.println(player);
    }

    public void printErrorMessage(String errorCode) {
    }

    public void printTeamList(List<TeamDTO> teamList) {
        teamList.forEach(System.out::println);
    }
}
