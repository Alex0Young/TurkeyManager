package com.example.alex.turkeymanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import  android.app.Activity;
import com.example.alex.turkeymanager.garbagedps.GarbageDpsActivity;

public class MainActivity extends Activity implements OnClickListener{

    Button mmicbtn;   //麦克风监测按钮

    Button mtelbtn;    //电话监测按钮

    Button mcleanbtn;  //清理加速按钮

    Button mrootbtn;   //权限管理

    Button mmonbtn;   //摄像头监测按钮

    Button mmsgbtn;   //短信监测按钮

    Button mpowbtn;   //电量监测管理

    Button mprobtn;  // 查杀病毒按钮

    Button mnetbtn;   //流量监测按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //加载主界面
    }

    @Override
    public void onContentChanged() {

        super.onContentChanged();
        /*
         * 主界面按钮实例化
         */


        // 麦克风跳转按钮
        mmicbtn = (Button) findViewById(R.id.btn_main_micmgr);
        mmicbtn.setOnClickListener(this);

        // 跳转监测摄像头按钮
        mmonbtn = (Button) findViewById(R.id.btn_main_monmgr);
        mmonbtn.setOnClickListener(this);
        // 权限管理跳转按钮
        mrootbtn = (Button) findViewById(R.id.btn_main_rootmgr);
        mrootbtn.setOnClickListener(this);
        // 电话管理跳转按钮
        mtelbtn = (Button) findViewById(R.id.btn_main_telmgr);
        mtelbtn.setOnClickListener(this);
        //  短信管理按钮
        mmsgbtn = (Button) findViewById(R.id.btn_main_msgmgr);
        mmsgbtn.setOnClickListener(this);
        //清理加速跳转按钮
        mcleanbtn = (Button) findViewById(R.id.btn_main_sdclean);
        mcleanbtn.setOnClickListener(this);
        //流量管理跳转按钮
        mnetbtn = (Button) findViewById(R.id.btn_main_netmgr);
        mnetbtn.setOnClickListener(this);
        //病毒查杀按钮
        mprobtn = (Button) findViewById(R.id.btn_main_pro);
        mprobtn.setOnClickListener(this);
        //电量管理
        mpowbtn = (Button) findViewById(R.id.btn_main_powmgr);
        mpowbtn.setOnClickListener(this);

    }

    public void gotoActivity(Context packageContext, Class<?> cls) {
        // 跳转 packageContext 当前页面 cls需要跳转的页面
        Intent intent = new Intent(packageContext, cls);
        startActivity(intent);

    }

    public void gotoActivity(Intent intent) {
        // TODO Auto-generated method stub
        startActivity(intent);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {

            case R.id.btn_main_micmgr:// 跳转麦克风管理界面
                gotoActivity(MainActivity.this, GarbageDpsActivity.class);

                break;
            case R.id.btn_main_monmgr:// 跳转摄像头检测界面
                gotoActivity(MainActivity.this, GarbageDpsActivity.class);

                break;
            case R.id.btn_main_rootmgr:// 跳转权限管理界面
                gotoActivity(MainActivity.this, GarbageDpsActivity.class);
                break;
            case R.id.btn_main_telmgr:// 跳转电话管理界面
                gotoActivity(MainActivity.this, GarbageDpsActivity.class);
                break;
            case R.id.btn_main_sdclean:// 跳转垃圾清理界面
                gotoActivity(MainActivity.this, GarbageDpsActivity.class);
                break;
            case R.id.btn_main_msgmgr://短信管理跳转界面
                gotoActivity(MainActivity.this, GarbageDpsActivity.class);
                break;
            case R.id.btn_main_netmgr://流量管理界面
                gotoActivity(MainActivity.this, GarbageDpsActivity.class);
                break;
            case R.id.btn_main_pro://病毒查杀
                gotoActivity(MainActivity.this, GarbageDpsActivity.class);
                break;
            case R.id.btn_main_powmgr://电量管理界面
                gotoActivity(MainActivity.this, GarbageDpsActivity.class);
                break;
            default:
                break;
        }

    }


}
