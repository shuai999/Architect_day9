package cn.novate.architect_day09;

import android.view.View;
import android.view.ViewGroup;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/6 18:04
 * Version 1.0
 * Params:
 * Description:    导航栏的规范
*/

public interface INavigation {

    void createNavigationBar();

    /**
     * 绑定参数
     */
    void attachNavigationParams();

    /**
     * 将 NavigationView添加到父布局
     */
    void attachParent(View navigationBar, ViewGroup parent);

}
