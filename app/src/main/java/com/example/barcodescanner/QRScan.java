package com.example.barcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class QRScan extends AppCompatActivity implements ZXingScannerView.ResultHandler {

    ZXingScannerView scannerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        scannerView = new ZXingScannerView(this);
        setContentView(scannerView);



    }

    @Override
    public void handleResult(Result rawResult) {

        MainActivity.textView.setText(rawResult.getText());
        onBackPressed();

    }

    @Override
    protected void onPause() {
        super.onPause();
            // In an on pause the scanner clss object i.e, Scanner view stops the camera
        scannerView.stopCamera();

    }

    @Override
    protected void onResume() {
        super.onResume();


        scannerView.setResultHandler(this); // We need to provide context such as this or get context
        scannerView.startCamera(); // Here Camera will start as on resume method call

    }
}
