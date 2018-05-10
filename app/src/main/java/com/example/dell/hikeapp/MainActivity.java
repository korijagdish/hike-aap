package com.example.dell.hikeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.hike_gridview );
        int img[]={R.drawable.boy1,R.drawable.boy1,R.drawable.boy1,R.drawable.boy1,R.drawable.boy1,R.drawable.boy1,R.drawable.boy1,R.drawable.boy1,R.drawable.boy1,R.drawable.boy1,R.drawable.boy1};
        String name[]={"jagdish","Rhoitt","Mahesh","Sonu","jayesh","Deepak","Ramesh","Kuldip","Hitesh","Dhaval","Sital"};
        GridView gv=(GridView)findViewById( R.id.hike_Gridview );
        Adapterclass_hike hm=new Adapterclass_hike(this,R.layout.activity_main,img,name);
        gv.setAdapter( hm );
    }
}
