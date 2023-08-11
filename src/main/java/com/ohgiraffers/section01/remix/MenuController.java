package com.ohgiraffers.section01.remix;

import java.util.List;

public class MenuController {

    private final MenuService menuService;
    private final PrintResult printResult;

    public MenuController() {
        menuService = new MenuService();
        printResult = new PrintResult();
    }

    public void selectAllPlayer() {

        List<PlayerDTO> playerList = menuService.selectAllPlayer();

        if(playerList != null) {
            printResult.printMenuList(playerList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }
}
