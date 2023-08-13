package com.ohgiraffers.section01.common;

import java.util.List;

public class PlayerDTO {

    private int playerCode;
    private int playerNo;
    private String playerName;
    private int teamCode;
    private String teamName;
    private String leagueName;

    public PlayerDTO() {
    }

    public PlayerDTO(int playerCode, int playerNo, String playerName, int teamCode, String teamName, String leagueName) {
        this.playerCode = playerCode;
        this.playerNo = playerNo;
        this.playerName = playerName;
        this.teamCode = teamCode;
        this.teamName = teamName;
        this.leagueName = leagueName;
    }

    public int getPlayerCode() {
        return playerCode;
    }

    public void setPlayerCode(int playerCode) {
        this.playerCode = playerCode;
    }

    public int getPlayerNo() {
        return playerNo;
    }

    public void setPlayerNo(int playerNo) {
        this.playerNo = playerNo;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(int teamCode) {
        this.teamCode = teamCode;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    @Override
    public String toString() {
        return "PlayerDTO{" +
                "playerCode=" + playerCode +
                ", playerNo=" + playerNo +
                ", playerName='" + playerName + '\'' +
                ", teamCode=" + teamCode +
                ", teamName='" + teamName + '\'' +
                ", leagueName='" + leagueName + '\'' +
                '}';
    }
}

