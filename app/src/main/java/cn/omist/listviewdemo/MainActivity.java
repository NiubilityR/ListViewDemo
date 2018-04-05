package cn.omist.listviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

 //  private String[] data = {"Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango", "Apple", "Banana", "Orange", "Watermelon", "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango"};
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        initFruits();
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        System.out.println("sdfiheguheg");
    }
    private void initFruits(){

        for(int i=0; i<2; i++){
            Fruit apple = new Fruit("Apple", R.drawable.form);
            fruitList.add(apple);
            Fruit apple1 = new Fruit("Apple1", R.drawable.form);
            fruitList.add(apple1);
            Fruit apple2 = new Fruit("Apple2", R.drawable.form);
            fruitList.add(apple2);
            Fruit apple3 = new Fruit("Apple3", R.drawable.form);
            fruitList.add(apple3);
            Fruit apple4 = new Fruit("Apple4", R.drawable.form);
            fruitList.add(apple4);
            Fruit apple5 = new Fruit("Apple5", R.drawable.form);
            fruitList.add(apple5);
            Fruit apple6 = new Fruit("Apple6", R.drawable.form);
            fruitList.add(apple6);
        }
    }
}


