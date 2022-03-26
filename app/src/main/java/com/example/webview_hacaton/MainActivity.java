package com.example.webview_hacaton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();
    ListView countriesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        // получаем элемент ListView
        countriesList = findViewById(R.id.countriesList);
        // создаем адаптер
        StateAdapter stateAdapter = new StateAdapter(this, R.layout.list_item, states);
        // устанавливаем адаптер
        countriesList.setAdapter(stateAdapter);
        // слушатель выбора в списке
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                // получаем выбранный пункт
                State selectedState = (State) parent.getItemAtPosition(position);

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", selectedState.getName());
                intent.putExtra("description", selectedState.getDescription());
                intent.putExtra("cover", selectedState.getFlagResource());
                intent.putExtra("data", selectedState.getData());
                intent.putExtra("rating", selectedState.getRating());
                intent.putExtra("url", selectedState.getUrl());
                startActivity(intent);
            }
        };countriesList.setOnItemClickListener(itemListener);
    }

    private void setInitialData() {

        states.add(new State("Я краснею", "Уверенная в себе тринадцатилетняя Мэй Ли разрывается между тем,\n" +
                " \t\t\tчтобы оставаться прилежной и послушной маминой дочкой и справиться с хаосом подросткового возраста. И, казалось бы, перемен в её интересах и отношениях и подростковых изменений в собственном теле и так достаточно, но нет — всякий раз,\n" +
                " \t\t\tкогда она слишком волнуется (что с подростком случается практически всегда), она моментально превращается в гигантскую красную панду!","2022-03-10", R.drawable.picture_1,2, "https://www.youtube.com/watch?v=XdKzUbAiswE"));
        states.add(new State("Человек-паук: Нет пути домой", "Мистерио удаётся выяснить истинную личность Человека-паука.\n" +
                " С этого момента жизнь Питера Паркера становится невыносимой.\n" +
                " Если ранее он мог успешно переключаться между своими амплуа, то сейчас это сделать невозможно.\n" +
                " Переворачивается с ног на голову не только жизнь Человека-пауку, но и репутация.\n" +
                " Понимая, что так жить невозможно, главный герой фильма «Человек-паук: Нет пути домой» принимает решение обратиться за помощью к своему давнему знакомому Стивену Стрэнджу.\n" +
                " Питер Паркер надеется, что с помощью магии он сможет восстановить его анонимность. Стрэндж соглашается помочь.","2021-12-15", R.drawable.picture_2, 3, "https://www.youtube.com/watch?v=JfVOs4VSpmA"));
        states.add(new State("Проект «Адам»", "12-летний Адам Рид все еще скорбит по своему отцу, который умер год назад.\n" +
                " Однажды он заходит в свой гараж и обнаруживает там раненого пилота, который оказывается самим Адамом из будущего.\n" +
                " Взрослый Адам рассказывает маленькому себе о том, что в будущем только-только появилась возможность путешествовать во времени и теперь он пытается вернуться в прошлое, чтобы спасти отца.\n" +
                " Герои должны объединить усилия, чтобы выполнить непростую миссию и спасти свой мир.","2022-03-11", R.drawable.picture_3,4, "https://www.youtube.com/watch?v=jakE9Yl7r4g"));
        states.add(new State("Игра теней", "Трэвис Блок - правительственный агент, который пытается смириться со своим темным прошлым.\n" +
                " Когда он обнаруживает заговор, нацеленный на граждан США, Блок оказывается под прицелом директора ФБР, которого он когда-то помогал защищать.","2022-02-10", R.drawable.picture_4,5,"https://www.youtube.com/watch?v=uPlCr1FFTZI"));
        states.add(new State("Энканто", "Удивительная семья Мадригалов живет в спрятанном в горах Колумбии волшебном доме, расположенном в чудесном и очаровательном уголке под названием Энканто.\n" +
                " Каждого ребёнка в семье Мадригалов магия этого места благословила уникальным даром — от суперсилы до способности исцелять.\n" +
                " Увы, магия обошла стороной одну лишь юную Мирабель.\n" +
                " Обнаружив, что магия Энканто находится в опасности, Мирабель решает, что именно она может быть последней надеждой на спасение своей особенной семьи.","2021-11-24", R.drawable.picture_5,1, "https://www.youtube.com/watch?v=CaimKeDcudo"));
    }
}
