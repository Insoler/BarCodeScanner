package com.example.barcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button qrbut;
   public static TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        qrbut = (Button) findViewById(R.id.butQR);
        textView = (TextView) findViewById(R.id.qrcode);

        qrbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // By using Click Listener we simply move on one activity to another
                Intent intent = new Intent(getApplicationContext(),QRScan.class);
                startActivity(intent);

            }
        });

    }
}
