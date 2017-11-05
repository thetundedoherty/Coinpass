package com.example.user.coinpass;

/**
 * Created by TheTundeDoherty on 10/24/2017.
 */

public class Currency {

    private String mBtc;
    private String mEth;


    public Currency(String bitcoin, String ethereum) {
        this.mBtc = bitcoin;
        this.mEth = ethereum;
    }

    public String getmBtc() {
        return mBtc;
    }

    public String getmEth() {
        return mEth;
    }

}
