package com.example.api_4.View.FRG;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.api_4.ViewModel.CommonVM;
import com.example.api_4.databinding.M000FlashBinding;

public class m000_flash extends base_FRG<M000FlashBinding, CommonVM> {
    @Override
    protected void initViews()
    {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                            callBack.showFragment(m001_login.class.getName(),null,false);
                }
            },1000);
    }

    @Override
    protected Class<CommonVM> ClassViewModel() {
        return CommonVM.class;
    }

    @Override
    protected M000FlashBinding initViewBinding(LayoutInflater inflater, ViewGroup container) {
        return M000FlashBinding.inflate(getLayoutInflater());
    }
}
