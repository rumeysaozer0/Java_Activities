package com.rumeysaozer.javaactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rumeysaozer.javaactivities.databinding.ActivityMain2Binding;
import com.rumeysaozer.javaactivities.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {
    private ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        binding.textView2.setText(userName);
        change();

    }
    public void change(){
        binding.change.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent);
        });
    }
}