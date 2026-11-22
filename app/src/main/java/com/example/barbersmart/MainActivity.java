package com.example.barbersmart;
import androidx.appcompat.app.AppCompatActivity;// jnlihoij

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText phoneNumber = findViewById(R.id.phoneNumber);
        EditText password = findViewById(R.id.password);
        Button logingButton = findViewById(R.id.logingButton);
        logingButton.setOnClickListener(view -> {
            String phoneNumberText = phoneNumber.getText().toString();
            String passwordText = password.getText().toString();
            if (phoneNumberText.isEmpty() || passwordText.isEmpty()) {
                Toast.makeText(this, " الرجاء ادخال لبيانات ", Toast.LENGTH_SHORT).show();
            }else{
                    Toast.makeText(this, "تم العمليه بنجاح", Toast.LENGTH_SHORT).show();

                }

        });
    }
}
