package com.atozmak.mvppattern.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.atozmak.mvppattern.bean.Bean;
import com.atozmak.mvppattern.view.ViewMain;

/**
 * Created by Mak on 2016/3/15.
 */
public class Model implements IModel {

    Bean bean = new Bean();

    @Override
    public void writeDataToDB(String words) {
        bean.setWordsToBean(words);
    }

    @Override
    public Bean getDataFromDB() {
        return bean;
    }
}
