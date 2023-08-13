package com.ohgiraffers.section01.remix;

import com.ohgiraffers.section01.common.PlayerDTO;
import com.ohgiraffers.section01.common.SearchCriteria;
import com.ohgiraffers.section01.common.TeamDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.remix.Template.getSqlSession;

public class MenuService {

    private MenuMapper mapper;

    // case 1 - 팀 조회 / 선수 조회
    public List<TeamDTO> selectAllTeam() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MenuMapper.class);
        List<TeamDTO> teamList = mapper.selectAllTeam();

        sqlSession.close();

        return teamList;
    }

    public List<PlayerDTO> selectAllPlayer() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(MenuMapper.class);
        List<PlayerDTO> playerList = mapper.selectAllPlayer();

        sqlSession.close();

        return playerList;

    }

    //  case 2 - if
    public void searchMenu(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MenuMapper.class);

        List<PlayerDTO> menuList = mapper.searchMenu(searchCriteria);

        if (menuList != null && menuList.size() > 0) {
            menuList.forEach(System.out::println);
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }

        sqlSession.close();
    }


    public boolean registPlayer(PlayerDTO player) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MenuMapper.class);

        int result = mapper.insertPlayer(player);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;
    }

    public boolean modifyPlayer(PlayerDTO player) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MenuMapper.class);

        int result = mapper.updatePlayer(player);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;

    }

    public boolean deletePlayer(PlayerDTO player) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MenuMapper.class);

        int result = mapper.deletePlayer(player);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0;

    }

    public void searchLeague(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MenuMapper.class);

        List<TeamDTO> teamList = mapper.searchLeague(searchCriteria);

        if (teamList != null && teamList.size() > 0) {
            teamList.forEach(System.out::println);
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }

        sqlSession.close();
    }
}
