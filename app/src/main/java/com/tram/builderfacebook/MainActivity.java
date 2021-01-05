package com.tram.builderfacebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AccFacbook accFacbook = new AccFacbook.Builder("Tram","099929992").withAddress("Ngõ 6, xã Đông Thuận,...").Build();

        Log.d("BBB Name:", accFacbook.getName()+"");
        Log.d("BBB Phone: ", accFacbook.getPhone()+"");
        Log.d("BBB Address: ", accFacbook.getAddress()+"");
        Log.d("BBB Age: ", accFacbook.getAge()+"");
        Log.d("BBB Area: ", accFacbook.getArea()+"");
    }
}