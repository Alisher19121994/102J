package com.best.a102j;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    static final String TAG = SignUpActivity.class.toString();
    EditText fullname_ID_sign_up, email_ID_sign_up, password_ID_sign_up, confirm_password_ID_sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getData();
    }

    public void getData() {
        fullname_ID_sign_up = findViewById(R.id.fullname_ID_sign_up);
        email_ID_sign_up = findViewById(R.id.email_ID_sign_up);
        password_ID_sign_up = findViewById(R.id.password_ID_sign_up);
        confirm_password_ID_sign_up = findViewById(R.id.confirm_password_ID_sign_up);

        Button button = findViewById(R.id.button_ID_sign_up);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        TextView textView = findViewById(R.id.text2_ID_sign_in);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}