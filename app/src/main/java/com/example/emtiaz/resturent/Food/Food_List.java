package com.example.emtiaz.resturent.Food;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.emtiaz.resturent.R;

public class Food_List extends AppCompatActivity {
    ListView listView;
    int[] food_pic = {R.drawable.food1,R.drawable.food2,R.drawable.food3,R.drawable.food4,
            R.drawable.food5,R.drawable.food6,R.drawable.food7,R.drawable.food8};
    String[] food_name;
    String[] price;
    FoodAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food__list);
        listView=(ListView) findViewById(R.id.lv_food);
        price= getResources().getStringArray(R.array.string_price);
        food_name= getResources().getStringArray(R.array.food_string_name);


        adapter= new FoodAdapter(getApplicationContext(),R.layout.activity_food);
        listView.setAdapter(adapter);
        int i=0;
        for(String f_name : food_name) {
            FoodDataProvider dataProvider= new FoodDataProvider(food_pic[i],f_name,price[i]);
            adapter.add(dataProvider);
            i++;
        }

        registerForContextMenu(listView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Select The Action");
        menu.add(0, v.getId(), 0, "Order 1 Piece");//groupId, itemId, order, title
        menu.add(0, v.getId(), 0, "Order 2 Piece");
        menu.add(0, v.getId(), 0, "Order 3 Piece");
        menu.add(0, v.getId(), 0, "Order 4 Piece");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){

        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        if(item.getTitle()=="Order 1 Piece"){
            Toast.makeText(getApplicationContext(),"you order 1",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Order 2 Piece"){
            Toast.makeText(getApplicationContext(), "you order 2" , Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Order 3 Piece"){
            Toast.makeText(getApplicationContext(), "you order 3", Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="Order 4 Piece"){
            Toast.makeText(getApplicationContext(), "you order 4"  , Toast.LENGTH_LONG).show();
        }


        return true;
    }
}


