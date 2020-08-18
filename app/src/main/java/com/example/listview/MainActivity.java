package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listview;
    private ListViewAdapter adapter;
    private ArrayList<ListViewItem> listViewItemArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new ListViewAdapter();
       // listview = findViewById(R.id.listView);
        listview.setAdapter(adapter);
        for (int i = 0; i < 10; i++){
            adapter.addItem(" ",
                    listViewItemArrayList.get(i).getImageTier(),
                    listViewItemArrayList.get(i).getSummerName(),
                    listViewItemArrayList.get(i).getTier(),
                    listViewItemArrayList.get(i).getRankName(),
                    listViewItemArrayList.get(i).getLeaguePoint());
        }
    }
}
