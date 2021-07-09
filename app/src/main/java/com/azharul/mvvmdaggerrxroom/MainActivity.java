package com.azharul.mvvmdaggerrxroom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @BindView(R.id.btn_create_number)
    Button btn_create_number;
    @BindView(R.id.tv_result)
    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

     /*   MainActivityViewModel mainActivityViewModel = new MainActivityViewModel();
        String myRandomNumber = mainActivityViewModel.getMyRandomNumber();
        tv_result.setText(myRandomNumber);*/
        MainActivityViewModel mainActivityViewModel=new ViewModelProvider(this).get(MainActivityViewModel.class);
        String myRandomNumber=mainActivityViewModel.getMyRandomNumber();
        tv_result.setText(myRandomNumber);
    }

    @OnClick(R.id.btn_create_number)
    public void createRandomNumber(View view) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: activity destroy");
    }
}