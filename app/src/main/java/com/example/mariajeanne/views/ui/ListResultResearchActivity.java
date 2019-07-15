package com.example.mariajeanne.views.ui;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.example.mariajeanne.R;
import com.example.mariajeanne.model.MariaJeanne;

public class ListResultResearchActivity extends AppCompatActivity {

    Intent intent = getIntent();
    RecyclerView mariaJeanneRcv;
    private MariaJeanneAdapter mariaJeanneAdapter;

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.action_home:
                    return true;

                case R.id.action_search:
                    Intent intentResearch = new Intent(ListResultResearchActivity.this, ResearchActivity.class);
                    startActivity(intentResearch);
                    return true;

                case R.id.action_favorite:
                    Intent intentFavorite = new Intent(ListResultResearchActivity.this, FavoriteActivity.class);
                    startActivity(intentFavorite);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_result_research);

        String name = intent.getStringExtra("name");
        String typeSearch = intent.getStringExtra("typeSearch");
        if(Integer.valueOf(typeSearch) == 0){
            initRecyclerViewWithoutSpecificity();
        }else{
            initRecyclerViewWithSpecificity(name);
        }


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_bar);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
    }

    private void initRecyclerViewWithSpecificity(String name) {
        mariaJeanneRcv.setLayoutManager(new LinearLayoutManager(this));
        mariaJeanneAdapter = new MariaJeanneAdapter();
        mariaJeanneRcv.setAdapter(mariaJeanneAdapter);
        mariaJeanneAdapter.setItemClickListener(new MariaJeanneAdapter.ItemClickListener() {
            @Override
            public void onClick(MariaJeanne mariaJeanne) {

            }
        });
    }

    private void initRecyclerViewWithoutSpecificity() {

    }
}
