package com.ohgiraffers.section01.remix;

public class PlayerDTO {

    private int playerCode;
    private int playerNo;
    private String playerName;
    private String teamName;

    public PlayerDTO() {
    }

    public PlayerDTO(int playerCode, int playerNo, String playerName, String teamName) {
        this.playerCode = playerCode;
        this.playerNo = playerNo;
        this.playerName = playerName;
        this.teamName = teamName;
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

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "PlayerDTO{" +
                "playerCode=" + playerCode +
                ", playerNo=" + playerNo +
                ", playerName='" + playerName + '\'' +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}

