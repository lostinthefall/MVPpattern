package com.atozmak.mvppattern.model;

import com.atozmak.mvppattern.bean.Bean;

/**
 * model里面做的是数据读写
 */
public interface IModel {

    //写入数据
    void writeDataToDB(String words);

    //获取数据
    Bean getDataFromDB();
}
