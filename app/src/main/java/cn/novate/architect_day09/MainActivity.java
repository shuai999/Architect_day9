package cn.novate.architect_day09;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewGroup parent = (ViewGroup) findViewById(R.id.view_root);

        DefaultNavigationBar navigationBar =
                new DefaultNavigationBar.Builder(this,parent)
                        .setLeftText("返回")
                        .hideLeftText()
                        .setLeftClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View v) {
                                finish();
                            }
                        })
                        // 还有一些参数
                        .create();



        Dialog dialog = new AlertDialog.Builder(this)
                .setTitle("标题")
                .setIcon(R.mipmap.ic_launcher)

                // 在 create()之前的所有操作都是 去存放我们的参数

                // create()方法主要是用于创建 Dialog对象，然后把参数取出来，设置给 Dialog，
                // 然后返回一个最终的Dialog对象
                .create() ;
    }
}
