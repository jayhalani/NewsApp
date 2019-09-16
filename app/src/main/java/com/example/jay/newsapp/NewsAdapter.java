package com.example.jay.newsapp;

import android.content.Context;
import android.support.annotation.NonNull;
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

    NewsAdapter(Context context, List<News> newses) {
        super(context, 0, newses);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.news_list_view, parent, false);
        }

        News currentNews = getItem(position);

        // Find the textView with ID headlines
        TextView headlinesTextView =
                listItemView.findViewById(R.id.headlines);
        assert currentNews != null;
        headlinesTextView.setText(currentNews.getHeadlines());

        // Find the textView with ID news_type
        TextView newsTypeTextView =
                listItemView.findViewById(R.id.news_type);
        newsTypeTextView.setText(currentNews.getArticleType());

        // Find the textView with ID news_date
        TextView newsDateTextView =
                listItemView.findViewById(R.id.news_date);
        newsDateTextView.setText(currentNews.getArticleDate());

        return listItemView;
    }

}
