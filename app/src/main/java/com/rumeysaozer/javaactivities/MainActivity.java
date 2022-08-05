package com.rumeysaozer.javaactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.rumeysaozer.javaactivities.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        userName = "";
        binding.change.setOnClickListener(v->{
            userName = binding.userName.getText().toString();
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("userName", userName);
        startActivity(intent);

        });
    }
}