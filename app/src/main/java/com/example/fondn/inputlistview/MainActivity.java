package com.example.fondn.inputlistview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Store> arrayList = new ArrayList<>();
    CustomAdapter customAdapter;
    Context context;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listviewID);




        editText = (EditText) findViewById(R.id.editTextID);
        button = (Button) findViewById(R.id.buttonID);


        customAdapter = new CustomAdapter(getApplicationContext(),arrayList);
        listView.setAdapter(customAdapter);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String namexx = editText.getText().toString();
                Store store = new Store(namexx);
                arrayList.add(store);

            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                arrayList.remove(position);
                customAdapter.notifyDataSetChanged();
                return false;
            }
        });










    }
}
