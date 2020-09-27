package com.example.shamindaabeysekara_comp304lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Intent intent = new Intent(MainActivity.this, AIActivity.class);
                startActivity(intent);
                //Toast.makeText(this, "AIActivity: \\n onCreate executed \\n onStart executed", Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Intent intent1 = new Intent(MainActivity.this, VRActivity.class);
                startActivity(intent1);
                //Toast.makeText(this, "VRActivity: \\n onCreate executed \\n onStart executed", Toast.LENGTH_LONG).show();
                break;


        }

    }
}
