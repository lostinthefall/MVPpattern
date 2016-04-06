package com.atozmak.mvppattern.view;

/**
 * Created by Mak on 2016/3/15.
 */
public interface IView {

    //获得view上的数据
    String getDataFromView();

    //把返回的结果显示在view上
    void setWordsOnTheScreen(String words);


}
