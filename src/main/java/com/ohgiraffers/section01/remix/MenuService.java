package com.ohgiraffers.section01.remix;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.remix.Template.getSqlSession;

public class MenuService {

    private MenuMapper menuMapper;
    public List<PlayerDTO> selectAllPlayer() {

        SqlSession sqlSession = getSqlSession();

        menuMapper = sqlSession.getMapper(MenuMapper.class);
        List<PlayerDTO> playerList = menuMapper.selectAllPlayer();

        sqlSession.close();

        return playerList;

    }
}
