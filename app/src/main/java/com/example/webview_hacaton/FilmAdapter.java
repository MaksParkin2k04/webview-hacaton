package com.example.webview_hacaton;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.webview_hacaton.data.Film;

import java.util.List;

public class FilmAdapter extends ArrayAdapter<Film> {

    public static final int MAX_DESCRIPTION_VALUE = 150;

    private final LayoutInflater inflater;
    private final int layout;
    private final List<Film> films;

    public FilmAdapter(Context context, int resource, List<Film> films) {
        super(context, resource, films);
        this.films = films;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        ImageView flagView = view.findViewById(R.id.flag);
        TextView nameView = view.findViewById(R.id.name);
        TextView descriptionView = view.findViewById(R.id.description);
        TextView dataView = view.findViewById(R.id.data);
        RatingBar ratingBarList  = view.findViewById(R.id.ratingBarList);

        Film film = films.get(position);

        flagView.setImageResource(film.getFlagResource());
        dataView.setText(film.getData());
        nameView.setText(film.getName());

        String description =getSubstring(film.getDescription(), MAX_DESCRIPTION_VALUE);
        descriptionView.setText(description);
        ratingBarList.setRating(film.getRating());


        return view;
    }

    private String getSubstring(String value, int maxValue){
        String result = value;
        if(result.length()>maxValue){
            result = result.substring(0, maxValue-3) + "...";
        }
        return result;
    }
}
