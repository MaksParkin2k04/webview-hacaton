package com.example.webview_hacaton;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class StateAdapter extends ArrayAdapter<State> {

    private LayoutInflater inflater;
    private int layout;
    private List<State> states;

    public StateAdapter(Context context, int resource, List<State> states) {
        super(context, resource, states);
        this.states = states;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        ImageView flagView = view.findViewById(R.id.flag);
        TextView nameView = view.findViewById(R.id.name);
        TextView capitalView = view.findViewById(R.id.description);
        TextView dataView = view.findViewById(R.id.data);
        RatingBar ratingBarList  = view.findViewById(R.id.ratingBarList);

        State state = states.get(position);

        flagView.setImageResource(state.getFlagResource());
        dataView.setText(state.getData());
        nameView.setText(state.getName());
        capitalView.setText(state.getDescription());
        ratingBarList.setRating(state.getRating());


        return view;
    }
}
