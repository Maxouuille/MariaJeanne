package com.example.mariajeanne.views.ui;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.mariajeanne.R;
import com.example.mariajeanne.views.contract.IResearchActivity;

public class ResearchActivity extends AppCompatActivity implements IResearchActivity {

    Button allBtn;

    /*EditText nameEdt = findViewById(R.id.research_activity_name_edt);
    EditText raceBtn = findViewById(R.id.research_activity_race_edt);

    Spinner effetSpinner = findViewById(R.id.research_activity_effect_spinner);
    Spinner flavourSpinner = findViewById(R.id.research_activity_flavour_spinner);*/

    Button validateBtn;

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.action_home:
                    Intent intentMain = new Intent(ResearchActivity.this, MainActivity.class);
                    startActivity(intentMain);
                    return true;

                case R.id.action_search:
                    return true;

                case R.id.action_favorite:
                    Intent intentFavorite = new Intent(ResearchActivity.this, FavoriteActivity.class);
                    startActivity(intentFavorite);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_bar);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        bottomNavigationView.setSelectedItemId(R.id.action_search);
        allBtn = findViewById(R.id.research_activity_all_btn);
        validateBtn = findViewById(R.id.research_activity_validate_btn);


        /**
         * effetSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Object item = parent.getItemAtPosition(pos);
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
         **/

       allBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intentListresultResearchActivity = new Intent(ResearchActivity.this, ListResultResearchActivity.class);
               intentListresultResearchActivity.putExtra("typeSearch", 0);
           }
       });
        /*validateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentListresultResearchActivity = new Intent(ResearchActivity.this, ListResultResearchActivity.class);
                intentListresultResearchActivity.putExtra("typeSearch", 0);
                intentListresultResearchActivity.putExtra("name", nameEdt.getText());
                //intentListresultResearchActivity.putExtra("race", raceBtn.getText());
            }
        });*/


    }


}
