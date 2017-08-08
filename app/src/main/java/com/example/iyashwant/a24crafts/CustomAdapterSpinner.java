package com.example.iyashwant.a24crafts;

/**
 * Created by iyashwant on 25/7/17.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapterSpinner extends BaseAdapter {
    Context context;
    
    String[] WhoN;
    LayoutInflater inflter;

    public CustomAdapterSpinner(Context applicationContext, String[] WhoN) {
        this.context = applicationContext;
      
        this.WhoN = WhoN;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return WhoN.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.spin_who, null);
       // ImageView icon = (ImageView) view.findViewById(R.id.imageView);
        TextView names = (TextView) view.findViewById(R.id.spin_text);
       // icon.setImageResource(flags[i]);
        names.setText(WhoN[i]);
        return view;
    }
}