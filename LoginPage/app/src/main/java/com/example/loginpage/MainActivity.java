package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username=(TextView) findViewById(R.id.login);
        TextView password=(TextView) findViewById(R.id.pass);

        MaterialButton bt= (MaterialButton) findViewById(R.id.loginbtn);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && (password.getText().toString().equals("admin")))
                {
                    //Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(getBaseContext(),MainActivity3.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Login Unsuccessful",Toast.LENGTH_LONG).show();

                }
            }
        });

    }
}