package com.example.lining.second;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.lining.second.adapter.ShoppingCartAdapter;

public class ShoppingCartActivity extends Activity {
    TextView jiesuan, proName, shopPrice, proCount;
    ListView aListView;
    private LayoutInflater layoutInflater;
    private TextView name;
    private LinearLayout mCartNoDataID;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewByID();
  /*  *//*开始线程*//*
        new Thread(new myThread()).start();{
        }*/
        ShoppingCartAdapter adapter=new ShoppingCartAdapter(ShoppingCartActivity.this);
        aListView.setAdapter(adapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        //        IsCheckLogin();
    }

  /*  *//**
     * 检测是否登录
     *//*
    public void IsCheckLogin() {
        //        String loginKey = myApplication.getLoginKey();
        //        if (loginKey != null && !loginKey.equals("")) {

        //			cartYesDataID.setVisibility(View.VISIBLE);
        //			cartNoDataID.setVisibility(View.GONE);
        //          loadingCartListData();//加载购物车数据
        ShoppingCartAdapter adapter = new ShoppingCartAdapter(ShoppingCartActivity.this);
        aListView.setAdapter(adapter);
    }

    else

    {

        aListView.setVisibility(View.GONE);
        mCartNoDataID.setVisibility(View.VISIBLE);

    }*/

//}

    /*根据ID找到控件*/

    public void findViewByID() {
        aListView = (ListView) findViewById(R.id.cart_shopping_listview);
        mCartNoDataID = (LinearLayout) findViewById(R.id.cartNoDataID);
    }

    /*//开辟线程
    public class myThread implements Runnable {
        public void run() {
            Message msg = new Message();
            try {
                Map<String, String> parmas = new HashMap<String, String>();
                parmas.put("username", "1");
                parmas.put("password", "2");
                String url = "http://192.168.1.110:8080/SchoolShopJson/ShoppingCart.txt";
                // 要发送的数据和访问的地址
                String result = AgentApi.dopost(parmas, url);
                // 如果返回的为空或者初始化时输入的ip地址无效(会返回下面的字符串)，说明服务器连接失败！
                if (result == null) {
                    // 使用-1代表服务器连接失败
                    msg.what = -1;
                } else {
                    msg.what=1;
                    msg.obj=result;
                }
            } catch (Exception e) {
                e.printStackTrace();
                // 使用-1代表程序异常
                msg.what = -2;
                msg.obj = e;
            }
            mHandler.sendMessage(msg);
        }
    }*/
    protected void initView() {
        // TODO Auto-generated method stub
    }
  /*  *//*子线程-解析数据*//*
    private Handler mHandler = new Handler(){
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case -1:
                    Toast.makeText(ShoppingCartActivity.this, "服务器连接失败!",
                            Toast.LENGTH_SHORT).show();
                    break;
                case -2:
                    Toast.makeText(ShoppingCartActivity.this, "哎呀，出错啦...",
                            Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    String temp = (String)msg.obj;
                    //将拿到的json转换为数组
                    List<shoppingCart> ShoppingcartInfo = JSON.parseArray(temp,shoppingCart.class);
                    ListView.setAdapter(new ShoppingCartAdapter(ShoppingCartActivity.this, ShoppingcartInfo));
                    break;
                default:
                    break;
            }
        }
    };*/
}