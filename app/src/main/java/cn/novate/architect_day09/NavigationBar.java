package cn.novate.architect_day09;

import android.content.Context;
import android.view.ViewGroup;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/5/6 18:09
 * Version 1.0
 * Params:
 * Description:    可以拿过来直接使用的 导航栏
*/

public class NavigationBar extends AbsNavigationBar{

    protected NavigationBar(Builder builder) {
        super(builder);
    }

    /**
     * 导航栏的Builder
     */
    public static class Builder extends AbsNavigationBar.Builder<NavigationBar.Builder>{

        public Builder(Context context, int layoutId, ViewGroup parent) {
            super(context, layoutId, parent);
        }

        @Override
        public NavigationBar create() {
            return new NavigationBar(this);
        }
    }
}
