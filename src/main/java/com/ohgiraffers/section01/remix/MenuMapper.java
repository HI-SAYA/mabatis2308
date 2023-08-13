package com.ohgiraffers.section01.remix;

import com.ohgiraffers.section01.common.PlayerDTO;
import com.ohgiraffers.section01.common.SearchCriteria;
import com.ohgiraffers.section01.common.TeamDTO;

import java.util.List;

public interface MenuMapper {

    List<TeamDTO> selectAllTeam();

    List<PlayerDTO> selectAllPlayer();

    List<PlayerDTO> searchMenu(SearchCriteria searchCriteria);

    int insertPlayer(PlayerDTO player);

    int updatePlayer(PlayerDTO player);

    int deletePlayer(PlayerDTO player);

    List<TeamDTO> searchLeague(SearchCriteria searchCriteria);
}

