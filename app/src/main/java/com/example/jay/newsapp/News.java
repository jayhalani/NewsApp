package com.example.jay.newsapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Jay on 4/22/2017.
 */

public class News implements Parcelable{
    private String mHeadlines;
    private String mArticleType;
    private String mArticleDate;
    private String mUrl;

    public News(String headlines, String articleType, String articleDate, String url){
        mHeadlines = headlines;
        mArticleType = articleType;
        mArticleDate = articleDate;
        mUrl = url;
    }

    private News(Parcel in){
        mHeadlines = in.readString();
        mArticleType = in.readString();
        mArticleDate = in.readString();
        mUrl = in.readString();
    }


    public String getHeadlines() {
        return mHeadlines;
    }

    public String getArticleType() {
        return mArticleType;
    }

    public String getArticleDate() {
        return mArticleDate;
    }

    public String getUrl() {
        return mUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mHeadlines);
        dest.writeString(mArticleType);
        dest.writeString(mArticleDate);
        dest.writeString(mUrl);
    }
    public static final Creator<News> CREATOR = new Creator<News>(){

        @Override
        public News createFromParcel(Parcel in) {
            return new News(in);
        }

        @Override
        public News[] newArray(int size) {
            return new News[size];
        }
    };
}
