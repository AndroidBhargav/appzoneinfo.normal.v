package com.appzoneinfo.vip;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.appzone.mylibrarys.BannerClass;
import com.appzone.mylibrarys.InterClass;
import com.appzone.mylibrarys.NativeClass;

public class TestingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);
        BannerClass.Banner(this, findViewById(R.id.main_banner));
        NativeClass.NativeAds(this, findViewById(R.id.main_native));

    }

    public void ADSs(View view) {
        startActivity(new Intent(this, MainActivity.class));
        InterClass.Interstitial(this);
        //        InterClass.OpenLink();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        InterClass.BackInterstitial(this);
    }

}