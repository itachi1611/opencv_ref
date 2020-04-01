package com.foxy.opencv_ref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.foxy.opencv_ref.color_blob_detection.ColorBlobDetectionActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {

    private Unbinder unbinder;

    @OnClick(R.id.btn01)
    protected void onDetectBlobColor() {
        startActivity(new Intent(this, ColorBlobDetectionActivity.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    //    @OnClick(R.id.btn02)
//
//    @OnClick(R.id.btn03)
//
//    @OnClick(R.id.btn04)
//
//    @OnClick(R.id.btn05)
//
//    @OnClick(R.id.btn06)
//
//    @OnClick(R.id.btn07)
//
//    @OnClick(R.id.btn08)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
    }

}
