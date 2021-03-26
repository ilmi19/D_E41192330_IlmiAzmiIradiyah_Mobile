package com.example.membuat_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionbutton(View view) {
        Toast.makeText(this,"Tekan Gambar di Bawah ini", Toast.LENGTH_SHORT).show();
    }

    public void actionimageView3(View view) {
        Toast.makeText(this,"1.Relative Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionimageView4(View view) {
        Toast.makeText(this,"2.Linier Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionimageView7(View view) {
        Toast.makeText(this,"3.Constrain Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionimageView8(View view) {
        Toast.makeText(this,"4.Tabel Layout", Toast.LENGTH_SHORT).show();
    }

    public void actionimageView9(View view) {
        Toast.makeText(this,"5.Matrial Design", Toast.LENGTH_SHORT).show();
    }

    public void actionimageView10(View view) {
        Toast.makeText(this,"6.Scroll View", Toast.LENGTH_SHORT).show();
    }

    public void actionimageView11(View view) {
        Toast.makeText(this,"7.Scroll View Horizontal", Toast.LENGTH_SHORT).show();
    }
}