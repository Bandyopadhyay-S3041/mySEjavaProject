package com.example.onlinebookstrore;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class LoginMatter extends AppCompatActivity {
    List<String> attrList=new ArrayList<>();
    List<Integer> attrPics=new ArrayList<>();

    private void addItems() {
        attrList.add("Magnificent Mile");
        attrList.add("Navy pier");
        attrList.add("Art institute of Chicago");
        attrList.add("Art institute of Chicago1");
        attrPics.add(R.drawable.books);
        attrPics.add(R.drawable.book1);
        attrPics.add(R.drawable.books);
        attrPics.add(R.drawable.book1);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_matter);
        ListView listView=findViewById(R.id.list);
        addItems();
        listView.setAdapter(new ArrayAdapter<>( this,android.R.layout.simple_list_item_1,attrList));
        myCustomAdapter myAdapter=new myCustomAdapter(this,attrList,attrPics);
        listView.setAdapter(myAdapter);


    }
}
