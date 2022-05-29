package com.example.listview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listview.fruit;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceSt
        setContentView(R.layout.activity_main);

        //ambil list view dari activity_main.xml
        ListView list=findViewById(R.id.list_view);

        //definisikan list adapter yang kita buat
        ListAdapter adapter=new ListAdapter(this,createPersons());

        //set adapter pada list view.
        list.setAdapter(adapter);
    }

    /*
     * Untuk menambahkan data pada list
     * silahkan tambahkan datanya di bawah ini
     * contoh: misal kita tambahkan 4 saja dulu.
     */
    private List<fruit> createPersons(){
        List<fruit>data=new ArrayList<>();
        data.add(new fruit(R.drawable.jambu,"Jambu","Rp.25000"));
        data.add(new fruit(R.drawable.jeruk,"Jeruk","Rp.30000"));
        data.add(new fruit(R.drawable.mangga,"Mangga","Rp35000"));
        data.add(new fruit(R.drawable.salak,"Salak","Rp23000"));
        data.add(new fruit(R.drawable.buah_naga,"Buah Naga","Rp40000"));
        data.add(new fruit(R.drawable.kelapa_muda,"Kelapa Muda","Rp5000"));
        data.add(new fruit(R.drawable.melon,"Melon","Rp45000"));
        data.add(new fruit(R.drawable.semangka,"Semangka","Rp45000"));
        data.add(new fruit(R.drawable.pisang,"Pisang","Rp15000"));

        return data;
    }
}