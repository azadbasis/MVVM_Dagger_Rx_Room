package com.azharul.mvvmdaggerrxroom;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityViewModel extends ViewModel {

    private static final String TAG = "MainActivityViewModel";
    private MutableLiveData<String> myRandomNumber;

    public MutableLiveData<String> getMyRandomNumber(){
        Log.d(TAG, "getMyRandomNumber: ");
        if (myRandomNumber == null) {
            myRandomNumber=new MutableLiveData<>();
            createNumber();
        }
        return myRandomNumber;
    }

    public void createNumber() {
        Random random=new Random();
        myRandomNumber.postValue("Number: "+(random.nextInt(100-1)+1));
        Log.d(TAG, "createNumber: ");
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.d(TAG, "onCleared: destroy viewModel");
    }
}
