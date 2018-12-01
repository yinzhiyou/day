package com.example.administrator.day;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        final EditText editText=findViewById(R.id.edit);
        Button button=findViewById(R.id.button);
        final CustomLayOut customLayOut=findViewById(R.id.layout);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView=new TextView(MainActivity.this);
                Editable text = editText.getText();
                textView.setText(text);
                textView.setTextColor(Color.RED);
                customLayOut.addView(textView);
            }
        });
    }
}
