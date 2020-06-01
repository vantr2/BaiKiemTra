package com.trongvan.baitapkiemtra;

import android.util.Log;

import java.util.Random;

public class TienIch {
    private int[] mangSoNguyen;

    public void khoitaoMangTuyY(){
        mangSoNguyen = new int[101];
        for (int i = 0; i < mangSoNguyen.length; i++) {
            mangSoNguyen[i] = -100 + new Random().nextInt(100); // cho trong khoảng (-100,100)
        }
    }

    public void inMang(){
        for (int i = 0; i < mangSoNguyen.length;i++){
            Log.e(MainActivity.TAG,"Phần tử thư " + i + ": " +  mangSoNguyen[i]);
        }
    }

    public boolean InClass(int n){
        for (int i = 0; i < mangSoNguyen.length; i++) {
            if(n == mangSoNguyen[i]){
                return true;
            }
        }
        return false;
    }
}
