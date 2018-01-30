package forfun.good.newtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import forfun.good.newtest.tripdata.tripDAO;
import forfun.good.newtest.tripdata.trip_constructor;
import forfun.good.newtest.tripdata.tripadd;

public class MainActivity extends AppCompatActivity {
    public static tripDAO dao;
    ListView lv;
    ArrayList<String> tripname;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dao = new tripadd(this);  //一定要有一個new放資料
        tripname = new ArrayList<>();
        adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,tripname);
        lv = findViewById(R.id.listview);
        lv.setAdapter(adapter);

    }
//    @Override
//    protected void onResume() {
//        super.onResume();
//        refreshData();
//    }
//    public void refreshData()
//    {
//        tripname.clear();
//        for (trip_constructor t : dao.getList())
//        {
//            tripname.add(t.title);
//        }
//        adapter.notifyDataSetChanged();
//    }
    public void clickgo (View v)
    {
        Intent it = new Intent(MainActivity.this,Newstart.class);
        startActivity(it);
    }
}
