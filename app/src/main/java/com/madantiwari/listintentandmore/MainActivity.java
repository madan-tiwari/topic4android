package com.madantiwari.listintentandmore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
     public static final String countries[]={
             "Nepal",
             "India",
             "China"
     };
    ListView lvcountries;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvcountries = findViewById(R.id.lvCountries);

        ArrayAdapter<String> countryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1
        , countries);
        lvcountries.setAdapter(countryAdapter);
    }
}
