package com.best.a102j;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    static final String TAG = SignInActivity.class.toString();
    EditText email_ID_sign_in, password_ID_sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        open();
    }

    public void open() {

        email_ID_sign_in = findViewById(R.id.email_ID_sign_in);
        password_ID_sign_in = findViewById(R.id.password_ID_sign_in);

        Button button = findViewById(R.id.button_ID_sign_in);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openData();
            }
        });
        TextView textView = findViewById(R.id.text2_ID_sign_up);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             getData();

            }
        });
    }
    public void openData(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void getData(){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

}