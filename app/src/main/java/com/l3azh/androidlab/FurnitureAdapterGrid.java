package com.l3azh.androidlab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FurnitureAdapterGrid extends BaseAdapter {
    LayoutInflater inflater;
    TextView tvName;
    ImageView imvCategories;
    Context context;
    ArrayList<Categories> arrayList;

    public FurnitureAdapterGrid(Context context, ArrayList<Categories> list) {
        // arraylist chưa có
        arrayList = list;
        inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View contentView, ViewGroup viewGroup) {

        View view = inflater.inflate(R.layout.sub_item_gridview, null);
        // Thiết lập thông tin hiển thị
        tvName = view.findViewById(R.id.tvName);
        tvName.setText(arrayList.get(i).name);
        imvCategories = view.findViewById(R.id.imvIcon);
        imvCategories.setImageBitmap(Utils.convertStringToBitmapFromAccess(context, arrayList.get(i).image1));
        return view;
    }
}
