package ru.mirea.mahmoud.b.i.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentAppActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_app);

        Button btnTime = (Button) findViewById(R.id.btnTime);
        Button btnDate = (Button) findViewById(R.id.btnDate);
        Button btnDateTime = (Button) findViewById(R.id.btnDateTime);

        btnTime.setOnClickListener(this);
        btnDate.setOnClickListener(this);
        btnDateTime.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()){
            case R.id.btnTime:
                intent = new Intent("android.intent.action.time");
                startActivity(intent);
                break;
            case R.id.btnDate:
                intent = new Intent("android.intent.action.date");
                startActivity(intent);
                break;
            case R.id.btnDateTime:
                intent = new Intent("android.intent.action.DateTime");
                startActivity(intent);
                break;
        }

    }
}