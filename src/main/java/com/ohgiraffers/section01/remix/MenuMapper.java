package com.ohgiraffers.section01.remix;

import java.util.List;

public interface MenuMapper {
    List<PlayerDTO> selectAllPlayer();

    List<TeamDTO> selectAllTeam();

    List<TeamDTO> searchName(SearchCriteria searchCriteria);
}
