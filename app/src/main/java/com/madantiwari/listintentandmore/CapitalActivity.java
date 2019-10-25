package com.madantiwari.listintentandmore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class CapitalActivity extends AppCompatActivity {

    TextView txtcapital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);

        txtcapital = findViewById(R.id.txtCapital);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String capital = bundle.getString("Capital");
            txtcapital.setText(capital);
        }
        else {
            Toast.makeText(this, "Not Found", Toast.LENGTH_SHORT).show();
        }
    }
}
