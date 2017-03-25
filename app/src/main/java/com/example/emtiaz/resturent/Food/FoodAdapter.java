package com.example.emtiaz.resturent.Food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.emtiaz.resturent.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by emtiaz on 3/23/17.
 */

public class FoodAdapter extends ArrayAdapter {

    List list=new ArrayList();
    public FoodAdapter(Context context, int resource) {
        super(context, resource);
    }
    static class DataHandlar{
        ImageView picture;
        TextView name;
        TextView price;

    }

    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }


    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        row=convertView;
        DataHandlar hand;
        if(convertView==null){
            LayoutInflater inflater= (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(R.layout.activity_food,parent,false);

           hand=new DataHandlar();
            hand.picture= (ImageView) row.findViewById(R.id.food_picsure);
            hand.name= (TextView) row.findViewById(R.id.food_name);
            hand.price= (TextView) row.findViewById(R.id.food_price);
            row.setTag(hand);
        }
        else {
            hand= (DataHandlar) row.getTag();
        }
        FoodDataProvider dataProvider;
        dataProvider= (FoodDataProvider) this.getItem(position);
        hand.picture.setImageResource(dataProvider.getFood_pic());
        hand.name.setText(dataProvider.getFood_name());
        hand.price.setText(dataProvider.getPrice());

        return row;
    }
}
