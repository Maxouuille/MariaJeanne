package com.example.mariajeanne.dto;

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
        //TODO comme le prof dans mylittlehero

        return mariaJeanne;
    }
}
