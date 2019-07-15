package com.example.mariajeanne.service;

import com.example.mariajeanne.dto.MariaJeanneDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MariaJeanneService {

    @GET("strains/search/all ")
    Call<List<MariaJeanneDTO>> getAllMJ();

    @GET("strains/search/name/{name}")
    Call<List<MariaJeanneDTO>> getMJByName(String name);

    @GET("strains/search/race/{race}")
    Call<List<MariaJeanneDTO>> getMJByRace(String race);

    @GET("strains/search/effect/{effect}")
    Call<List<MariaJeanneDTO>> getMJByEffect(String effect);

    @GET("strains/search/flavor/{flavor}")
    Call<List<MariaJeanneDTO>> getMJByFlavor(String flavor);

    @GET("searchdata/effects ")
    Call<List<String>> getAllEffect();

    @GET("searchdata/flavors")
    Call<List<String>> getAllFlavors();
}
