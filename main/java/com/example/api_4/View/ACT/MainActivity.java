package com.example.api_4.View.ACT;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.viewbinding.ViewBinding;

import android.os.Bundle;

import com.example.api_4.R;
import com.example.api_4.View.FRG.m000_flash;
import com.example.api_4.ViewModel.CommonVM;
import com.example.api_4.databinding.ActivityMainBinding;

public class MainActivity extends base_ACT<ActivityMainBinding, CommonVM> {

    @Override
    protected void initViews() {
            showFragment(m000_flash.class.getName(),null,false);
    }

    @Override
    protected Class<CommonVM> ClassViewModel() {
        return CommonVM.class;
    }

    @Override
    protected ActivityMainBinding initViewBinding() {
        return ActivityMainBinding.inflate(getLayoutInflater());
    }

    @Override
    protected int getIDmain() {
        return R.id.Ln_main;
    }
}