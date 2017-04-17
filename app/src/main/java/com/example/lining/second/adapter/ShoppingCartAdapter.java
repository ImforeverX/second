package com.example.lining.second.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lining.second.R;

public class ShoppingCartAdapter extends BaseAdapter {
    private Context context;

    public ShoppingCartAdapter(Context context) {
        this.context=context;
    }

    //    private List<shoppingCart> mList;
    /*public ShoppingCartAdapter(Context mContext,List<shoppingCart> mList) {
        super();
        this.mContext = mContext;
        this.mList = mList;
    }*/
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
       /* if (mList==null) {
            return 0;
        }else {
            return this.mList.size();
        }*/
    return 10;
    }
    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
       /* if (mList == null) {
            return null;
        } else {
            return this.mList.get(position);
        }*/

        return null;
    }
    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(this.context).inflate(R.layout.item, null,true);
            holder.image=(ImageView) convertView.findViewById(R.id.pro_image);
            holder.chose=(CheckBox) convertView.findViewById(R.id.pro_checkbox);
            holder.proName=(TextView) convertView.findViewById(R.id.pro_name);
            holder.proPrice=(TextView)convertView.findViewById(R.id.pro_shopPrice);
            holder.proCount=(TextView) convertView.findViewById(R.id.pro_count);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        /*if (this.mList != null) {
            shoppingCart shoppingList=this.mList.get(position);
            holder.proName.setText(shoppingList.getProName().toString());
            holder.proPrice.setText(shoppingList.getShopPrice().toString());
            holder.proCount.setText(shoppingList.getProCount().toString());
        }*/
        return convertView;
    }
    /*定义item对象*/
    public class ViewHolder {
        ImageView image;
        TextView proName;
        CheckBox chose;
        TextView proPrice;
        TextView proCount;
    }
}