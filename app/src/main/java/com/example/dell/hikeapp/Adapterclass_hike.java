package com.example.dell.hikeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapterclass_hike extends BaseAdapter {
  Context con;
   int res;
   LayoutInflater ly;
   int[]im;
   String[]name;




    public Adapterclass_hike(Context MainActivity ,int Activity_main,int[]img,String[]name ){
      this.con= MainActivity;
      this.res=Activity_main;
      this.im=img;
      this.name=name;



    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int Position) {
        return Position;
    }

    @Override
    public long getItemId(int Position) {
        return Position;
    }

    @Override
    public View getView(int Position, View Convertview, ViewGroup Parent) {
        Convertview=ly.from( con ).inflate( res,Parent,false );
        ImageView imo=(ImageView)Convertview.findViewById(R.id.round_images );
        TextView tx=(TextView)Convertview.findViewById(R.id.text_Hike1 );
        imo.setImageResource(im[Position]);
        tx.setText( name[Position] );
        return Convertview;
    }
}
