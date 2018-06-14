package com.example.nichilascarrillo.uielementsexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText edittext;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.textView);
        edittext = findViewById(R.id.editText);
        button   = findViewById(R.id.button);

        textView.setText("this text is changed in the onCreate");

        setListener();

    }

    private void setListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//              take input from editText and set as value for textEdit
                textView.setText(edittext.getText());
            }
        });


    }


}
