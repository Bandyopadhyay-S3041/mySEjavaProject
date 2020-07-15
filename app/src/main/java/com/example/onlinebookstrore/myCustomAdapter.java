package com.example.onlinebookstrore;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class myCustomAdapter extends BaseAdapter {
    List<String> adapterList;
    List<Integer> adapterPics;
    Context context;


    public myCustomAdapter(Context context ,List<String> myList, List<Integer> myPics){
        adapterList=myList;
        adapterPics=myPics;
        this.context=context;

    }


    @Override
    public int getCount() {
        //Size of data
        return adapterList.size();
    }

    @Override
    public Object getItem(int position) {
        return adapterList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            LayoutInflater myLayoutInflater = LayoutInflater.from(parent.getContext());
            convertView=myLayoutInflater.inflate(R.layout.layout,parent, false);
        }
        TextView txtViewItem=convertView.findViewById(R.id.txtViewItem);
        txtViewItem.setText(adapterList.get(position));
        Drawable img=parent.getResources().getDrawable(adapterPics.get(position));
        img.setBounds(0,0,80,80);
        txtViewItem.setCompoundDrawablePadding(16);
        txtViewItem.setCompoundDrawables(img,null,null,null);

        return convertView;

    }
}
