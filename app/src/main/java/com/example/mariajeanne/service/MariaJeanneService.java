package com.example.mariajeanne.service;

import com.example.mariajeanne.dto.MariaJeanneDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MariaJeanneService {

    @GET("strains/search/all ")
    Call<List<MariaJeanneDTO>> getAllMJ();
}
