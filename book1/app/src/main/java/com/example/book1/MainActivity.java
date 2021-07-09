package com.example.book1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button map_btn = (Button) findViewById(R.id.map_btn);  //지도 버튼 클릭 -> map으로 액티비티 전환
        map_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), map.class);
                startActivity(intent);
            }
        });

        Button cnf_btn = (Button) findViewById(R.id.cnf_btn);
        cnf_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), configure.class);
                startActivity(intent);
            }
        });
    }
}