package com.example.mariajeanne.views;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.mariajeanne.R;

public class FavoriteActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.action_home:
                    Intent intentMain = new Intent(FavoriteActivity.this, MainActivity.class);
                    startActivity(intentMain);
                    return true;

                case R.id.action_search:
                    Intent intentFavorite = new Intent(FavoriteActivity.this, ResearchActivity.class);
                    startActivity(intentFavorite);
                    return true;

                case R.id.action_favorite:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_bar);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
    }
}
