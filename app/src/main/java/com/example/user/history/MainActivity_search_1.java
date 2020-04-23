package com.example.user.history;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_search_1 extends AppCompatActivity {
    MaterialSearchView searchView;
    ListView lstView;


    String[] lstSource = {


      "Тарас Григорович Шевченко — (відомий також як Кобза́р; 25 лютого (9 березня) 1814, с. Моринці, Київська губернія, Російська імперія (нині Звенигородський район, Черкаська область, Україна) — 26 лютого (10 березня) 1861, Санкт-Петербург, Російська імперія) — український поет, письменник (драматург, прозаїк), художник (живописець, гравер), громадський та політичний діяч. Національний герой і символ України.",
      "Іван Я́кович Фра́нко ́— (27 серпня 1856, с. Нагуєвичі — 28 травня 1916, Львів, Австро-Угорщина) — видатний український письменник, поет, публіцист, перекладач, науковець, громадський і політичний діяч. Доктор філософії (1893), дійсний член Наукового товариства імені Шевченка (1899), почесний доктор Харківського університету (1906)",
    "Ле́ся Украї́нка ́— (справжнє імя Лари́са Петрі́вна Ко́сач-Кві́тка; 13 (25) лютого 1871, Звягель, нині Новоград-Волинський[5] — 19 липня (1 серпня) 1913, Сурамі, Грузія) — українська письменниця, перекладачка, культурна діячка. Співзасновниця літературного гуртка «Плеяда». В сучасній українській традиції входить до переліку найвідоміших жінок давньої та сучасної України.",
    "Григо́рій Са́вич Сковорода́ ́— (22 листопада (3 грудня) 1722, Чорнухи, Лубенський полк — 29 жовтня (9 листопада) 1794, Іванівка, Харківщина) — видатний український філософ-містик, богослов, поет, педагог, можливо, і композитор літургійної музики. Мав значний вплив на сучасників і подальші покоління своїми байками, піснями, філософськими творами, а також способом життя, через що його називали «Сократом».",
    "Лі́на Васи́лівна Косте́нко (нар. 19 березня 1930, Ржищів, Київська округа, Українська СРР) — українська письменниця, поетеса-шістдесятниця. Лауреат Шевченківської премії (1987), Премії Антоновичів (1989).",
    "Підмоги́льний Валерян (Валеріян) Петро́вич  ́—(2 лютого 1901, с. Писарівка[2], тепер Дніпропетровська область (за іншими даними с. Чаплі під Катеринославом[3]) — 3 листопада 1937, Сандармох, Карелія) — український письменник і перекладач, один з найвизначніших прозаїків українського «розстріляного відродження»."

};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search_1);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_search);
        setSupportActionBar(toolbar);
        char dm = (char) 34;
        getSupportActionBar().setTitle("Словник: "+dm+"Біографія"+dm);
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));

        lstView = (ListView)findViewById(R.id.lstView);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,lstSource);
        lstView.setAdapter(adapter);


        searchView = (MaterialSearchView)findViewById(R.id.search_view);

        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {

            }

            @Override
            public void onSearchViewClosed() {

                //If closed Search View , lstView will return default
                lstView = (ListView)findViewById(R.id.lstView);
                ArrayAdapter adapter = new ArrayAdapter(MainActivity_search_1.this,android.R.layout.simple_list_item_1,lstSource);
                lstView.setAdapter(adapter);

            }
        });

        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if(newText != null && !newText.isEmpty()){
                    List<String> lstFound = new ArrayList<String>();
                    for(String item:lstSource){
                        if(item.contains(newText))
                            lstFound.add(item);
                    }

                    ArrayAdapter adapter = new ArrayAdapter(MainActivity_search_1.this,android.R.layout.simple_list_item_1,lstFound);
                    lstView.setAdapter(adapter);
                }
                else{
                    //if search text is null
                    //return default
                    ArrayAdapter adapter = new ArrayAdapter(MainActivity_search_1.this,android.R.layout.simple_list_item_1,lstSource);
                    lstView.setAdapter(adapter);
                }
                return true;
            }

        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        MenuItem item = menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);
        return true;
    }
}
