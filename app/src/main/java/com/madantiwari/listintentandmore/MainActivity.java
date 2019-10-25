package com.madantiwari.listintentandmore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
     public static final String countries[]={
             "Nepal", "Kathmandu",
             "India", "New Delhi",
             "China", "Beijing",
             "UK", "London",
             "Canada","Ottawa"
     };
    ListView lvcountries;
    private Map<String, String> countriesMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvcountries = findViewById(R.id.lvCountries);

        countriesMap = new HashMap<>();
        for(int i=0;i<countries.length; i+=2){
            countriesMap.put(countries[i],countries[i+1]);
        }

        ArrayAdapter countryAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                new ArrayList<String>(countriesMap.keySet())
        );

        lvcountries.setAdapter(countryAdapter);

        lvcountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String country = parent.getItemAtPosition(position).toString();
                String capital = countriesMap.get(country);

                Toast.makeText(MainActivity.this, "Capital of "+country+" is: "+capital,
                        Toast.LENGTH_SHORT).show();

            }
        });
    }

}
