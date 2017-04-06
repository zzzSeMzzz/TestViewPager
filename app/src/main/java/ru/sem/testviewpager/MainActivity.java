package ru.sem.testviewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ViewPager viewPager;
    private CustomPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager2);

    }

    public void onClickAdd(View v){
        Log.d(TAG, "onClickAdd");
        if(adapter==null) return;
        adapter.addItemToPg1(new Contact("Test add", "test last name"));
    }

    public void onClickSetAdapter(View v){
        Log.d(TAG, "onClickSetAdapter");
        adapter = new CustomPagerAdapter(this);
        viewPager.setAdapter(adapter);
       // adapter.notifyDataSetChanged();
    }
}
