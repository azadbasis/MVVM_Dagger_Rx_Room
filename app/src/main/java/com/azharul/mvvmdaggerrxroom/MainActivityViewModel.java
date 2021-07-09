package com.azharul.mvvmdaggerrxroom;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityViewModel extends ViewModel {

    private static final String TAG = "MainActivityViewModel";
    private String myRandomNumber;

    public String getMyRandomNumber(){
        if (myRandomNumber == null) {
            createNumber();
        }
        return myRandomNumber;
    }

    private void createNumber() {
        Random random=new Random();
        myRandomNumber="Number: "+(random.nextInt(10-1)+1);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.d(TAG, "onCleared: destroy viewModel");
    }
}
