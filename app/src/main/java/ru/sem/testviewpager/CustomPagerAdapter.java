package ru.sem.testviewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class CustomPagerAdapter extends PagerAdapter {

    private Context mContext;
    private List<Contact> contacts = new ArrayList<>();
    private ViewGroup pg1;

    public CustomPagerAdapter(Context context) {
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        CustomPagerEnum customPagerEnum = CustomPagerEnum.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(customPagerEnum.getLayoutResId(), collection, false);
        if(position==0) {
            this.pg1=layout;
            RecyclerView recyclerView = (RecyclerView) layout.findViewById(R.id.rvNotif);
            recyclerView.setAdapter(new SysNotifAdapter(contacts));
        }
        collection.addView(layout);
        return layout;
    }



    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return CustomPagerEnum.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        CustomPagerEnum customPagerEnum = CustomPagerEnum.values()[position];
        return customPagerEnum.getTitleResId();
    }

    public void addItemToPg1(Contact contact){
        this.contacts.add(contact);
        ((RecyclerView) pg1.findViewById(R.id.rvNotif)).getAdapter().notifyDataSetChanged();
    }

}
