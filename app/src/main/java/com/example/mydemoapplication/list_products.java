package com.example.mydemoapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

public class list_products extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_products);

        String[] txt1 = getIntent().getStringArrayExtra("Names");
        String[] txt2 = getIntent().getStringArrayExtra("Desc");
        String[] txt3 = getIntent().getStringArrayExtra("Rating");
        String[] txt4 = getIntent().getStringArrayExtra("Price");
        int image = getIntent().getIntExtra("Image",0);

        RecyclerView viewList = (RecyclerView) findViewById(R.id.recyclerView);
        viewList.setLayoutManager(new LinearLayoutManager(this));
        viewList.setAdapter(new AdapterClass(txt1,txt2,txt3,txt4, image,this));
    }

}
