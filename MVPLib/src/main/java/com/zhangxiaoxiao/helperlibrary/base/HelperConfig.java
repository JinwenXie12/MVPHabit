package com.zhangxiaoxiao.helperlibrary.base;

import android.content.Context;

/**
 * ProjectName:  helperHabis
 * Author:  xxzhang
 * CreateAt:  2018/9/3  17:02
 * Description:  初始化数据
 * Copyright © itzxx Inc. All Rights Reserved
 */
public class HelperConfig {

    private static Context context;

    public static Context getContext() {
        return context;
    }

    /**
     * 初始化工具类
     *
     * @param context 上下文
     */
    public static Builder init(Context context) {
        HelperConfig.context = context.getApplicationContext();
        return Builder.create();
    }

    private static class Builder{

        private Builder() {
        }

        public  static Builder create(){
            return new Builder();
        }
    }
}
