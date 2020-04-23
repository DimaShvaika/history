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

public class MainActivity_search_2 extends AppCompatActivity {
    MaterialSearchView searchView;
    ListView lstView;
    String mess;


    String[] lstSource = {

            "De libertate — для ліричного героя воля – найбільше багатство. Ліричний герой, розмірковуючи над питанням, що таке свобода, заперечує порівняння цього людського блага із золотом: «зрівнявши все злото, проти свободи воно лиш – болото». В останніх двох рядках він згадує і славить Б. Хмельницького як символ вольності.",
            "Всякому місту – звичай і права... — автор ставить в один ряд і засуджує здирників і бюрократів, розпусників і пияків, ледарів і підлабузників. Ліричний герой думає не про маєтки й чини, а про те, щоб мати чисту совість, жити мудро й померти з ясним розумом. Перемогти смерть здатна лише людина з чистою совістю й помислами, перед смертю всі рівні – і мужик, і цар. Кожна строфа побудована на антитезі: 4 рядки – суспільні вади, 2 рядки – ідеал чистої совісті та ясного розуму. ",
            "Бджола та Шершень — байка у формі діалогу між персонажами розкриває одвічну тему суперечності між трудовим способом життя й паразитичним існуванням. Образи Бджоли й Шершня алегоричні: Бджола – «герб мудрої людини, що в природженому тілі трудиться», а Шершень – «образ людей, що живуть крадіжкою чужого й родилися на те тільки, щоб їсти й пити». Бджола бачить своє щастя лише в «сродній праці», тобто праці за покликанням: «Нам незрівнянно більша втіха збирати мед, ніж споживати. До цього ми народжені». Шершень цього збагнути не може й зарозуміло наділяє Бджолу такими характеристиками: «ти така дурна», «багато у вас голів, та всі безглузді». ",
            "Слово про похід Ігорів — оповідь співця Бояна про похід новгород-сіверського князя Ігоря разом із братом Всеволодом, незважаючи на пророче затемнення сонця – лихі віщування природи – перший бій з половцями, перемога князя Ігоря – другий бій, поразка війська Ігоря – віщий «мутен сон» київського князя Святослава та його «золоте слово, з сльозами змішане», звернене до руських князів – плач Ярославни в Путивлі на забралі, звертання її до сил природи – князь Ігор у полоні – утеча його з неволі з допомогою Овлура – погоня половців за князем – зустріч на рідній землі й уславлення Ігоря та його дружини.",
            "Повість минулих літ — на початку XII ст. за князювання Володимира Мономаха на основі попередніх зведень монах Києво-Печерського монастиря Нестор створив «Повість минулих літ», довівши записи до 1113 року. Літопис створювався впродовж тривалого часу багатьма митцями, але на початку XII ст. завершив, упорядкував і дав назву літопису київський монах – чернець Нестор. Ідейно-тематична спрямованість «Повісті…» походить від ідеї зображення давності й могутності держави Київська Русь, героїчне минуле якої пов’язане із правлінням виключно мудрих сильних та справедливих князів (княгиня Ольга, князь Святослав)."


};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search_2);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_search);
        setSupportActionBar(toolbar);
        char dm = (char) 34;
        getSupportActionBar().setTitle("Словник: "+dm+"Твори"+dm);
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));

        lstView = (ListView)findViewById(R.id.lstView);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,lstSource);
        lstView.setAdapter(adapter);

        mess = getResources().getString(R.string.biof_1_1);

        searchView = (MaterialSearchView)findViewById(R.id.search_view);

        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {

            }

            @Override
            public void onSearchViewClosed() {

                //If closed Search View , lstView will return default
                lstView = (ListView)findViewById(R.id.lstView);
                ArrayAdapter adapter = new ArrayAdapter(MainActivity_search_2.this,android.R.layout.simple_list_item_1,lstSource);
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

                    ArrayAdapter adapter = new ArrayAdapter(MainActivity_search_2.this,android.R.layout.simple_list_item_1,lstFound);
                    lstView.setAdapter(adapter);
                }
                else{
                    //if search text is null
                    //return default
                    ArrayAdapter adapter = new ArrayAdapter(MainActivity_search_2.this,android.R.layout.simple_list_item_1,lstSource);
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
