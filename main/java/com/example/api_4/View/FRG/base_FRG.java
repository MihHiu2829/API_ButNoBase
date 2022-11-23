package com.example.api_4.View.FRG;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

import com.example.api_4.OnCallBack;

public abstract class base_FRG <T extends ViewBinding, M extends ViewModel>  extends Fragment {

    T binding ;
    M viewModel ;
    Object data ;
    OnCallBack callBack ;
    Context context ;

    public void setCallBack(OnCallBack callBack) {
        this.callBack = callBack;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context ;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = initViewBinding(inflater,container);
        viewModel = new ViewModelProvider(this).get(ClassViewModel());
        initViews();
        return binding.getRoot() ;
    }

    protected abstract void initViews();

    protected abstract Class<M> ClassViewModel();

    protected abstract T initViewBinding(LayoutInflater inflater, ViewGroup container);
}
