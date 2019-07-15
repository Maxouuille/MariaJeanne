package com.example.mariajeanne.dto.mapper;

import com.example.mariajeanne.dto.MariaJeanneDTO;
import com.example.mariajeanne.model.MariaJeanne;

import java.util.ArrayList;
import java.util.List;

public class MariaJeanneMapper {

    public static List<MariaJeanne> map(List<MariaJeanneDTO> mariaJeanneDTOList){
        List<MariaJeanne> mariaJeanneList = new ArrayList<>();
        for (MariaJeanneDTO mariaJeanneDTO : mariaJeanneDTOList){
            mariaJeanneList.add(map(mariaJeanneDTO));
        }
        return mariaJeanneList;
    }

    private static MariaJeanne map(MariaJeanneDTO mariaJeanneDTO){
        MariaJeanne mariaJeanne = new MariaJeanne();
        mariaJeanne.setRace(MariaJeanneDTO.getRace());
        mariaJeanne.setName(MariaJeanneDTO.getName());
        mariaJeanne.setFlavor(MariaJeanneDTO.getFlavors());


        return mariaJeanne;
    }
}
