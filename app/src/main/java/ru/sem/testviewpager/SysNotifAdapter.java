package ru.sem.testviewpager;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;


public class SysNotifAdapter extends RecyclerView.Adapter<SysNotifAdapter.ViewHolder>{

    private List<Contact> records;
    private static final String TAG = "SysNotifAdapter";

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name, lastname;
        private ImageButton btnDelete;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.textView);
            lastname = (TextView) itemView.findViewById(R.id.textView2);
        }
    }

    public SysNotifAdapter(List<Contact> records) {
        this.records = records;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_contact, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public int getItemCount() {
        return records.size();
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {
        Contact record = records.get(i);


        viewHolder.name.setText(record.getName());
        viewHolder.lastname.setText(record.getLastname());
    }
}
