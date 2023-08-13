package com.ohgiraffers.section01.remix;

import com.ohgiraffers.section01.common.PlayerDTO;
import com.ohgiraffers.section01.common.TeamDTO;

import java.util.List;
import java.util.Map;

public class MenuController {

    private final MenuService menuService;
    private final PrintResult printResult;

    private MenuMapper mapper;

    public MenuController() {
        menuService = new MenuService();
        printResult = new PrintResult();
    }

    public void selectAllTeam() {
        List<TeamDTO> teamList = menuService.selectAllTeam();

        if(teamList != null) {
            printResult.printTeamList(teamList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }
    public void selectAllPlayer() {

        List<PlayerDTO> playerList = menuService.selectAllPlayer();

        if(playerList != null) {
            printResult.printPlayerList(playerList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void registPlayer(Map<String, String> parameter) {

        int playerNo = Integer.parseInt(parameter.get("playerNo"));
        String playerName = parameter.get("playerName");
        int teamCode = Integer.parseInt(parameter.get("teamCode"));
        String teamName = parameter.get("teamName");
        String leagueName = parameter.get("leagueName");

        PlayerDTO player = new PlayerDTO();
        player.setPlayerNo(playerNo);
        player.setPlayerName(playerName);
        player.setTeamCode(teamCode);
        player.setTeamName(teamName);
        player.setLeagueName(leagueName);

        if(menuService.registPlayer(player)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }

    }

    public void modifyPlayer(Map<String, String> parameter) {
        int playerCode = Integer.parseInt(parameter.get("playerCode"));
        int playerNo = Integer.parseInt(parameter.get("playerNo"));
        String playerName = parameter.get("playerName");
        int teamCode = Integer.parseInt(parameter.get("teamCode"));
        String teamName = parameter.get("teamName");
        String leagueName = parameter.get("leagueName");

        PlayerDTO player = new PlayerDTO();
        player.setPlayerCode(playerCode);
        player.setPlayerNo(playerNo);
        player.setPlayerName(playerName);
        player.setTeamCode(teamCode);
        player.setTeamName(teamName);
        player.setLeagueName(leagueName);

        if(menuService.modifyPlayer(player)) {
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }

    public void deletePlayer(Map<String, String> parameter) {
        int playerCode = Integer.parseInt(parameter.get("playerCode"));

        PlayerDTO player = new PlayerDTO();
        player.setPlayerCode(playerCode);

        if(menuService.deletePlayer(player)) {
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }

    }
}
