package ru.mirea.mahmoud.b.i.resultactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivityActivity extends AppCompatActivity {

    private TextView textViewResult;
    private final int REQUEST_CODE = 143;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_activity);

        textViewResult = findViewById(R.id.textView2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null){
            String university = data.getStringExtra("name");
            setUniversityTextView(university);
        }
    }

    public void startDataActivityOnClick(View view) {
        Intent intent = new Intent(this, DataActivityActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }
    private void setUniversityTextView(String university){
        textViewResult.setText(university);
    }
}