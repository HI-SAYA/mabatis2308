package com.ohgiraffers.section01.remix;

public class TeamDTO {

    private int teamCode;
    private String teamName;
    private int leagueCode;
    private String leagueName;

    public TeamDTO() {
    }

    public TeamDTO(int teamCode, String teamName, int leagueCode, String leagueName) {
        this.teamCode = teamCode;
        this.teamName = teamName;
        this.leagueCode = leagueCode;
        this.leagueName = leagueName;
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

    public int getLeagueCode() {
        return leagueCode;
    }

    public void setLeagueCode(int leagueCode) {
        this.leagueCode = leagueCode;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    @Override
    public String toString() {
        return "TeamDTO{" +
                "teamCode=" + teamCode +
                ", teamName='" + teamName + '\'' +
                ", leagueCode=" + leagueCode +
                ", leagueName='" + leagueName + '\'' +
                '}';
    }
}
