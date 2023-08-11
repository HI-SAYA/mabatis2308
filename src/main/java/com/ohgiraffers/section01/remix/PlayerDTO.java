package com.ohgiraffers.section01.remix;

public class PlayerDTO {

    private int playerCode;
    private int playerNo;
    private String playerName;
    private String teamName;
    private int teamCode;
    private int leagueCode;
    private String starter;

    public PlayerDTO() {
    }

    public PlayerDTO(int playerCode, int playerNo, String playerName, String teamName, int teamCode, int leagueCode, String starter) {
        this.playerCode = playerCode;
        this.playerNo = playerNo;
        this.playerName = playerName;
        this.teamName = teamName;
        this.teamCode = teamCode;
        this.leagueCode = leagueCode;
        this.starter = starter;
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

    public int getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(int teamCode) {
        this.teamCode = teamCode;
    }

    public int getLeagueCode() {
        return leagueCode;
    }

    public void setLeagueCode(int leagueCode) {
        this.leagueCode = leagueCode;
    }

    public String getStarter() {
        return starter;
    }

    public void setStarter(String starter) {
        this.starter = starter;
    }

    @Override
    public String toString() {
        return "PlayerDTO{" +
                "playerCode=" + playerCode +
                ", playerNo=" + playerNo +
                ", playerName='" + playerName + '\'' +
                ", teamName='" + teamName + '\'' +
                ", teamCode=" + teamCode +
                ", leagueCode=" + leagueCode +
                ", starter='" + starter + '\'' +
                '}';
    }
}
