package com.example.mariajeanne.service;

import com.example.mariajeanne.dto.MariaJeanneDTO;
import com.example.mariajeanne.dto.mapper.MariaJeanneMapper;
import com.example.mariajeanne.model.MariaJeanne;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkProvider {
    MariaJeanneService mariaJeanneService;

    private NetworkProvider(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl("strainapi.evanbusse.com/BSkR8ph/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        mariaJeanneService = retrofit.create(MariaJeanneService.class);
    }

    public void getAllMJ(final Listener<List<MariaJeanne>> listListener){
        mariaJeanneService.getAllMJ().enqueue(new Callback<List<MariaJeanneDTO>>() {
            @Override
            public void onResponse(Call<List<MariaJeanneDTO>> call, Response<List<MariaJeanneDTO>> response) {
                List<MariaJeanneDTO> mariaJeanneDTOList = response.body();
                List<MariaJeanne> mariaJeanneList = MariaJeanneMapper.map(mariaJeanneDTOList);

                listListener.onSuccess(mariaJeanneList);
            }

            @Override
            public void onFailure(Call<List<MariaJeanneDTO>> call, Throwable t) {
                listListener.onError(t);
            }
        });
    }

    public void getMJByName(final Listener<List<MariaJeanne>> listListener, String name){
        mariaJeanneService.getMJByName(name).enqueue(new Callback<List<MariaJeanneDTO>>() {
            @Override
            public void onResponse(Call<List<MariaJeanneDTO>> call, Response<List<MariaJeanneDTO>> response) {
                List<MariaJeanneDTO> mariaJeanneDTOList = response.body();
                List<MariaJeanne> mariaJeanneList = MariaJeanneMapper.map(mariaJeanneDTOList);

                listListener.onSuccess(mariaJeanneList);
            }

            @Override
            public void onFailure(Call<List<MariaJeanneDTO>> call, Throwable t) {
                listListener.onError(t);
            }
        });
    }

    public void getMJByRace(final Listener<List<MariaJeanne>> listListener, String race){
        mariaJeanneService.getMJByRace(race).enqueue(new Callback<List<MariaJeanneDTO>>() {
            @Override
            public void onResponse(Call<List<MariaJeanneDTO>> call, Response<List<MariaJeanneDTO>> response) {
                List<MariaJeanneDTO> mariaJeanneDTOList = response.body();
                List<MariaJeanne> mariaJeanneList = MariaJeanneMapper.map(mariaJeanneDTOList);

                listListener.onSuccess(mariaJeanneList);
            }

            @Override
            public void onFailure(Call<List<MariaJeanneDTO>> call, Throwable t) {
                listListener.onError(t);
            }
        });
    }

    public void getMJByEffect(final Listener<List<MariaJeanne>> listListener, String effect){
        mariaJeanneService.getMJByEffect(effect).enqueue(new Callback<List<MariaJeanneDTO>>() {
            @Override
            public void onResponse(Call<List<MariaJeanneDTO>> call, Response<List<MariaJeanneDTO>> response) {
                List<MariaJeanneDTO> mariaJeanneDTOList = response.body();
                List<MariaJeanne> mariaJeanneList = MariaJeanneMapper.map(mariaJeanneDTOList);

                listListener.onSuccess(mariaJeanneList);
            }

            @Override
            public void onFailure(Call<List<MariaJeanneDTO>> call, Throwable t) {
                listListener.onError(t);
            }
        });
    }

    public void getMJByFlavor(final Listener<List<MariaJeanne>> listListener, String flavor){
        mariaJeanneService.getMJByFlavor(flavor).enqueue(new Callback<List<MariaJeanneDTO>>() {
            @Override
            public void onResponse(Call<List<MariaJeanneDTO>> call, Response<List<MariaJeanneDTO>> response) {
                List<MariaJeanneDTO> mariaJeanneDTOList = response.body();
                List<MariaJeanne> mariaJeanneList = MariaJeanneMapper.map(mariaJeanneDTOList);

                listListener.onSuccess(mariaJeanneList);
            }

            @Override
            public void onFailure(Call<List<MariaJeanneDTO>> call, Throwable t) {
                listListener.onError(t);
            }
        });
    }

    public interface Listener<T>{
        void onSuccess(T data);

        void onError(Throwable t);
    }
}
