package com.crearunalistasimple.cesargarcia.crearunlistviewconimagenesenandroidstudio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private String peliculas[]=new String[]{"ALPHA AND OMEGA","X-MEN","MALEFICA","BATMAN","LEGO","HOTEL TRANSILBANIA","CHARLIE","PIRATAS","CROODS","LORAX"};

    private Integer[] imgid={R.drawable.peli1, R.drawable.peli2, R.drawable.peli3,R.drawable.peli4, R.drawable.peli5, R.drawable.peli6, R.drawable.peli7,
            R.drawable.peli8, R.drawable.peli9, R.drawable.peli10,};

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LenguajeListAdapter adapter=new LenguajeListAdapter(this,peliculas,imgid);
        lista=(ListView)findViewById(R.id.mi_lista);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Slecteditem = peliculas[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
                int num;
                num=position ;
                if (num == 0) {

                Intent intent = new Intent(MainActivity.this, peli01.class);
                intent.putExtra("parametro", "string");
                startActivity(intent);
            }
                if (num == 1) {

                    Intent intent = new Intent(MainActivity.this, peli2.class);
                    intent.putExtra("parametro", "string");
                    startActivity(intent);
                }
                if (num == 2) {

                    Intent intent = new Intent(MainActivity.this, peli3.class);
                    intent.putExtra("parametro", "string");
                    startActivity(intent);
                }
                if (num == 3) {

                    Intent intent = new Intent(MainActivity.this, peli4.class);
                    intent.putExtra("parametro", "string");
                    startActivity(intent);
                }
                if (num == 4) {

                    Intent intent = new Intent(MainActivity.this, peli5.class);
                    intent.putExtra("parametro", "string");
                    startActivity(intent);
                }
                if (num == 5) {

                    Intent intent = new Intent(MainActivity.this, peli6.class);
                    intent.putExtra("parametro", "string");
                    startActivity(intent);
                }
                if (num == 6) {

                    Intent intent = new Intent(MainActivity.this, peli7.class);
                    intent.putExtra("parametro", "string");
                    startActivity(intent);
                }
                if (num == 7) {

                    Intent intent = new Intent(MainActivity.this, peli8.class);
                    intent.putExtra("parametro", "string");
                    startActivity(intent);
                }
                if (num == 8) {

                    Intent intent = new Intent(MainActivity.this, peli9.class);
                    intent.putExtra("parametro", "string");
                    startActivity(intent);
                }
                if (num == 9) {

                    Intent intent = new Intent(MainActivity.this, peli10.class);
                    intent.putExtra("parametro", "string");
                    startActivity(intent);
                }
            }

        });
    }
}


