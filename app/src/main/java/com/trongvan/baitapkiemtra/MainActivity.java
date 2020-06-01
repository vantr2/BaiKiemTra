package com.trongvan.baitapkiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    //color code hexa
    public static final String XANH_NHAT = "#ACBC2E";
    public static final String DO = "#FF0000";
    public static final String TIM = "#DA6EE8";
    public static final String XANH_DUONG = "#0000ff";
    public static final String XANH_DAM = "#339505";

    //TAG kiểm tra c
    public static final String TAG = "doimau";

    //khai báo view
    private LinearLayout do1,do2,do3;
    private LinearLayout tim;
    private LinearLayout xanhduong1,xanhduong2;
    private LinearLayout xanhnhat1,xanhnhat2;
    private LinearLayout xanhdam2,xanhdam3;

    //biến kiểm tra
    private boolean ktXanhnhat = true;
    private boolean ktDo = true;
    private boolean ktXanhduong = true;
    private boolean ktXanhdam = true;
    private boolean ktTim = true;

    //biến đếm trên các vùng màu, trắng k đếm
    private int c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
        initView();

        xanhnhat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doiMauXanhNhat();
            }
        });

        xanhnhat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doiMauXanhNhat();
            }
        });

        do1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doiMauDo();
            }
        });

        do2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doiMauDo();
            }
        });

        do3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doiMauDo();
            }
        });

        xanhduong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doiMauXanhDuong();
            }
        });

        xanhduong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doiMauXanhDuong();
            }
        });

        xanhdam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doiMauXanhDam();
            }
        });

        xanhdam3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doiMauXanhDam();
            }
        });

        tim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doiMauTim();
            }
        });

        //CÂU 2
        TienIch tienIch = new TienIch();
        tienIch.khoitaoMangTuyY();
        tienIch.inMang();
        int n = 34;
        if(tienIch.InClass(n)){
            Log.e(TAG,n + " có trong mảng");
        }else{
            Log.e(TAG, n+ " không có trong mảng");
        }

    }

    private void initView() {
        do1 = (LinearLayout) findViewById(R.id.do1);
        do2 = (LinearLayout) findViewById(R.id.do2);
        do3 = (LinearLayout) findViewById(R.id.do3);

        xanhdam2 = (LinearLayout) findViewById(R.id.xanhdam2);
        xanhdam3 = (LinearLayout) findViewById(R.id.xanhdam3);

        xanhduong1 = (LinearLayout) findViewById(R.id.xanhduong1);
        xanhduong2 = (LinearLayout) findViewById(R.id.xanhduong2);

        tim = (LinearLayout) findViewById(R.id.tim);

        xanhnhat1 = (LinearLayout) findViewById(R.id.xanhnhat1);
        xanhnhat2 = (LinearLayout) findViewById(R.id.xanhnhat2);
    }

    private void doiMauXanhNhat(){
        if(ktXanhnhat){
            c++;
            Log.e(TAG,"Số lần kích chuột lên vùng màu: " + c );
            xanhnhat1.setBackgroundColor(Color.WHITE);
            xanhnhat2.setBackgroundColor(Color.WHITE);
        }else{
            xanhnhat1.setBackgroundColor(Color.parseColor(XANH_NHAT));
            xanhnhat2.setBackgroundColor(Color.parseColor(XANH_NHAT));
        }
        ktXanhnhat = !ktXanhnhat;
    }

    private void doiMauDo(){
        if(ktDo){
            c++;
            Log.e(TAG,"Số lần kích chuột lên vùng màu: " + c );
            do1.setBackgroundColor(Color.WHITE);
            do2.setBackgroundColor(Color.WHITE);
            do3.setBackgroundColor(Color.WHITE);
        }else{
            do1.setBackgroundColor(Color.parseColor(DO));
            do2.setBackgroundColor(Color.parseColor(DO));
            do3.setBackgroundColor(Color.parseColor(DO));
        }
        ktDo = !ktDo;
    }

    private void doiMauXanhDuong(){
        if(ktXanhduong){
            c++;
            Log.e(TAG,"Số lần kích chuột lên vùng màu: " + c );
            xanhduong1.setBackgroundColor(Color.WHITE);
            xanhduong2.setBackgroundColor(Color.WHITE);
        }else{
            xanhduong1.setBackgroundColor(Color.parseColor(XANH_DUONG));
            xanhduong2.setBackgroundColor(Color.parseColor(XANH_DUONG));
        }
        ktXanhduong = !ktXanhduong;
    }

    private void doiMauXanhDam(){
        if(ktXanhdam){
            c++;
            Log.e(TAG,"Số lần kích chuột lên vùng màu: " + c );
            xanhdam2.setBackgroundColor(Color.WHITE);
            xanhdam3.setBackgroundColor(Color.WHITE);
        }else{
            xanhdam2.setBackgroundColor(Color.parseColor(XANH_DAM));
            xanhdam3.setBackgroundColor(Color.parseColor(XANH_DAM));
        }
        ktXanhdam = !ktXanhdam;
    }

    private void doiMauTim(){
        if(ktTim){
            c++;
            Log.e(TAG,"Số lần kích chuột lên vùng màu: " + c );
            tim.setBackgroundColor(Color.WHITE);
        }else{
            tim.setBackgroundColor(Color.parseColor(TIM));
        }
        ktTim = !ktTim;
    }


}
