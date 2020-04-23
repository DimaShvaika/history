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

public class MainActivity_search_3 extends AppCompatActivity {
    MaterialSearchView searchView;
    ListView lstView;
    String mess;


    String[] lstSource = {

            "Автонім (грецьк. auto — сам та опута — ім’я) — справжнє ім’я автора, який підписує власні твори псевдонімом. Так, автонім Марка Вовчка — Марія Вілінська, Панаса Мирного — П.Рудченко, Остапа Вишні — П.Губенко, О.Олеся — О.Кандиба, Юрія Клена — О.Бургардт.",
            "Мемуари (фр. memoires — спогади) — оповідь у формі записок від імені автора про реальні події минулого, учасником або ж очевидцем яких він був. Провідною жанровою ознакою мемуаристики є суб’єктивне осмислення певних історичних подій, життєвого шляху конкретно-історичної постаті із залученням документів, співвіднесенням власного духовного досвіду автора з внутрішнім світом його героїв, соціально-психологічною природою їх вчинків, мотивацією дій і рішень. Засновником цього жанру вважається Ксенофонт — автор спогадів про Сократа й військовий похід греків (“Анабасис”, 401 до н.е.). У римську добу до М. звертався Юлій Цезар (“Нотатки про Галльську війну”), в добу середньовіччя — П.Абеляр (“Історія моїх поневірянь”), в епоху Відродження — Б.Челліні та ін. Інтерес до М. не згасав і пізніше (Й.-В.Гете, мадам де Сталь, Стендаль, Г.Гейне, І.Тургенєв, А.Франс, Р.Тагор, Е.Хемінгуей та ін.). М. притаманна документальність, історична достовірність, хоча не виключається право автора на художній домисел.",
            "Ідеологія (грецьк. idea — першообраз, logos — вчення) — система політичних, правових, морально-етичних, релігійних, естетичних і філософських поглядів, ідей, теоретичних засад, які кристалізуються на теоретичному рівні суспільної свідомості. Від І. відрізняють соціальну психологію як сукупність соціальних почуттів, настроїв, думок, уявлень, які виникають у сфері буденної свідомості під впливом довкілля і способу життя людей. І., як правило, концентровано виражає соціально-станові (класові) інтереси, розробляється професіоналами (вченими і політично-партійними лідерами) і має відносно самостійний характер.",
            "Абсурд (лат. absurdus — безглуздий) — нісенітниця, безглуздя. Термін у цьому значенні вживається істориками літератури і критиками, які аналізують поведінку персонажів художніх творів з позицій правдоподібності (культурно-історична школа, реальна критика). Термінологічного статусу абсурд набуває у словосполученнях “література абсурду”, “театр абсурду”, які використовуються для умовної назви художніх творів (романів, п’єс), що змальовують життя у вигляді начебто хаотичного нагромадження випадковостей, безглуздих, на перший погляд, ситуацій (творчість Е.Іонеско, С.Беккета, окремі твори Ж.П.Сартра, А.Камю). Підкреслений алогізм, ірраціоналізм у вчинках персонажів, мозаїчна композиція творів, гротеск і буфонада у засобах їх творення — характерні прикмети такого мистецтва. Тому термін “література абсурду” зберігає значення передусім у цій системі і може вживатися для її характеристики. Більш нейтральним щодо оцінного навантаження може бути термін “абсурдистська література”.",
            "Літопис — пам’ятка історичної прози Київської Русі та козацької доби. Розповідь часто починалася словами “В літо…” — с звідси назва жанру. Л. мали такі різновиди: щорічна хроніка та власне літописні оповідання, що мають відповідну літературну обробку. Л. — інтеграційний жанр, що поєднує в собі і легенду, і вояцьку повість, і житіє святого, і розмаїті документи тощо. Нові Л. складалися у вигляді зведень, іноді компіляцій попередніх аналогічних текстів, супроводжувалися певними скороченнями чи доповненнями залежно від Історичної концепції, політичних настанов або особистих смаків кожного автора. Перші записи історичних подій Київської Русі збереглися від X ст. Як жанр Л. поширилися у добу Ярослава Мудрого (1019-54) з метою обґрунтування появи християнства у тогочасній Київській державі. Наступний період Л. пов’язаний із діяльністю Никона, ченця Києво-Печерської лаври, що припадає на 60-70-ті IX ст. Форма щорічних статей, запроваджена в ті часи, різнить києво-руський Л. від візантійських хронік, обмежуваних періодами володарювання певних імператорів."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search_3);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_search);
        setSupportActionBar(toolbar);
        char dm = (char) 34;
        getSupportActionBar().setTitle("Словник: "+dm+"Літературний словник"+dm);
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
                ArrayAdapter adapter = new ArrayAdapter(MainActivity_search_3.this,android.R.layout.simple_list_item_1,lstSource);
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

                    ArrayAdapter adapter = new ArrayAdapter(MainActivity_search_3.this,android.R.layout.simple_list_item_1,lstFound);
                    lstView.setAdapter(adapter);
                }
                else{
                    //if search text is null
                    //return default
                    ArrayAdapter adapter = new ArrayAdapter(MainActivity_search_3.this,android.R.layout.simple_list_item_1,lstSource);
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
