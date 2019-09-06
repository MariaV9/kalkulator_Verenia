package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView4;
    EditText editText1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button3);
        textView4 = findViewById(R.id.text_view4);
        editText1 = findViewById(R.id.edit_text1);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                readText();
                Toast.makeText(MainActivity.this, "Text", Toast.LENGTH_SHORT).show();
            }
        });
    }
    void readText() {
        String text = editText1.getText().toString();
        textView4.setText(text + " - OK");
    }
}

