package com.example.api_4.View.FRG;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import com.example.api_4.ViewModel.m001_LoginVM;
import com.example.api_4.databinding.M001LoginBinding;

public class m001_login extends base_FRG<M001LoginBinding, m001_LoginVM> {
    @Override
    protected void initViews() {
        Log.e(m001_login.class.getName(),"InitViews... ") ;
            binding.btLogin.setOnClickListener(v -> viewModel.getAuthen());
            binding.res.setOnClickListener(v -> gotoPage(v));
    }
    private void gotoPage(View v) {
          String link =  "https://www.themoviedb.org/signup" ;
        v.startAnimation(AnimationUtils.loadAnimation(context, androidx.appcompat.R.anim.abc_fade_in));
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(link)) ;
        startActivity(intent);

    }

    @Override
    protected Class<m001_LoginVM> ClassViewModel() {
        return m001_LoginVM.class;
    }

    @Override
    protected M001LoginBinding initViewBinding(LayoutInflater inflater, ViewGroup container) {
        return M001LoginBinding.inflate(getLayoutInflater());
    }
}
