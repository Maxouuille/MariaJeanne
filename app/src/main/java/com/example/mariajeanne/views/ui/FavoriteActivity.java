package com.example.mariajeanne.views.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;

import com.example.mariajeanne.R;
import com.example.mariajeanne.views.contract.IFavoriteActivity;

public class FavoriteActivity extends AppCompatActivity implements IFavoriteActivity {

    Button connectionBtn;
    //GoogleSignInClient mGoogleSignInClient;

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
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
        /*connectionBtn = findViewById(R.id.activity_favorite_connection_btn);
        connectionBtn.setOnClickListener(v -> {
            GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                    .requestEmail()
                    .build();
            mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        });*/
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_bar);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        bottomNavigationView.setSelectedItemId(R.id.action_favorite);
    }
}
