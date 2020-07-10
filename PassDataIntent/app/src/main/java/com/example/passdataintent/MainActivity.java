package com.example.passdataintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText text1,text2,text3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=findViewById(R.id.txt1);
        text2=findViewById(R.id.txt2);
        text3= findViewById(R.id.txt3);
        button=findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String fname=text1.getText().toString();
                String mname=text2.getText().toString();
                String lname = text3.getText().toString();

                if(fname.equals("") || mname.equals("") || lname.equals("")){
                    Toast.makeText(getApplicationContext(),"Fill all the fields",Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("FNAME",fname);
                    intent.putExtra("MNAME",mname);
                    intent.putExtra("LNAME",lname);
                    startActivity(intent);
                    finish();

                }
            }
        });

    }
}