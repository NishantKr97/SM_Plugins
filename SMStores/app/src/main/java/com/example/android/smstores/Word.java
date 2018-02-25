package com.example.android.smstores;

/**
 * Created by NISHANT on 30-01-2018.
 */

public class Word {
    private String mStoreList;
    private String mNormalCashback;
    private String mPrimeCashback;

    public Word(String mStoreList,String mNormalCashback, String mPrimeCashback){
        this.mStoreList = mStoreList;
        this.mNormalCashback = mNormalCashback;
        this.mPrimeCashback = mPrimeCashback;
    }

    public String getmStoreList(){
        return  mStoreList;
    }

    public String getmNormalCashback(){
        return mNormalCashback;
    }

    public String getmPrimeCashback(){
        return mPrimeCashback;
    }

}
