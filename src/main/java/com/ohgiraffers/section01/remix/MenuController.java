package com.ohgiraffers.section01.remix;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.remix.Template.getSqlSession;

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
            printResult.printMenuList(playerList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }


    public void searchName(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MenuMapper.class);

        List<TeamDTO> teamList = mapper.searchName(searchCriteria);

        if(teamList != null && teamList.size() > 0) {
            teamList.forEach(System.out::println);
        } else {
            printResult.printErrorMessage("searchName");
        }

        sqlSession.close();
    }
}
