package com.example.webview_hacaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.webview_hacaton.data.Film;
import com.example.webview_hacaton.data.FilmRepository;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FilmRepository repository = new FilmRepository();


        setContentView(R.layout.activity_main);
        // получаем элемент ListView
        ListView filmList = findViewById(R.id.countriesList);
        // создаем адаптер
        FilmAdapter filmAdapter = new FilmAdapter(this, R.layout.list_item, repository.getFilms());
        // устанавливаем адаптер
        filmList.setAdapter(filmAdapter);
        // слушатель выбора в списке
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                // получаем выбранный пункт
                Film film = (Film) parent.getItemAtPosition(position);

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", film.getName());
                intent.putExtra("description", film.getDescription());
                intent.putExtra("cover", film.getFlagResource());
                intent.putExtra("data", film.getData());
                intent.putExtra("rating", film.getRating());
                intent.putExtra("url", film.getUrl());
                startActivity(intent);
            }
        };

        filmList.setOnItemClickListener(itemListener);
    }


}
