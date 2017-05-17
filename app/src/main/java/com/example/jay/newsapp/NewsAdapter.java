package com.example.jay.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jay on 4/22/2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> newses) {
        super(context, 0, newses);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.news_list_view, parent, false);
        }

        News currentNews = getItem(position);

        // Find the textView with ID headlines
        TextView headlinesTextView = (TextView)
                listItemView.findViewById(R.id.headlines);
        headlinesTextView.setText(currentNews.getHeadlines());

        // Find the textView with ID news_type
        TextView newsTypeTextView = (TextView)
                listItemView.findViewById(R.id.news_type);
        newsTypeTextView.setText(currentNews.getArticleType());

        // Find the textView with ID news_date
        TextView newsDateTextView = (TextView)
                listItemView.findViewById(R.id.news_date);
        newsDateTextView.setText(currentNews.getArticleDate());

        return listItemView;
    }

}
