package com.example.mariajeanne.views.ui;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.mariajeanne.R;
import com.example.mariajeanne.presenter.contract.IMainPresenter;
import com.example.mariajeanne.views.contract.IMainActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements IMainActivity {

    private IMainPresenter mainPresenter;

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.action_home:
                    return true;

                case R.id.action_search:
                    Intent intentResearch = new Intent(MainActivity.this, ResearchActivity.class);
                    startActivity(intentResearch);
                    return true;

                case R.id.action_favorite:
                    Intent intentFavorite = new Intent(MainActivity.this, FavoriteActivity.class);
                    startActivity(intentFavorite);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_bar);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        bottomNavigationView.setSelectedItemId(R.id.action_home);
    }

    @Override
    public void makeRandomnMj() {
        Random r = new Random();
        int i1 = (r.nextInt(100) + 1);
        mainPresenter.getRandomMj(i1);
    }
}
