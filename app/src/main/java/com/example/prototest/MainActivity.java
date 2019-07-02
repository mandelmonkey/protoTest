package com.example.prototest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import lnrpc.LightningGrpc;
import lnrpc.Rpc.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
