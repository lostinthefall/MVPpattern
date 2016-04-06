package com.atozmak.mvppattern.presenter;

import android.util.Log;

import com.atozmak.mvppattern.bean.Bean;
import com.atozmak.mvppattern.model.IModel;
import com.atozmak.mvppattern.model.Model;
import com.atozmak.mvppattern.view.IView;
import com.atozmak.mvppattern.view.ViewMain;

/**
 * 原理：
 * 1.activity把view传给presenter使双方取得关联
 * 2.在presenter使用new Model的方式使双方取得关联
 */
public class Presenter {


    private IView mIView;
    //接口
    private IModel mIMODEL;

    public Presenter(IView iView) {
        this.mIView = iView;
        //接口，类，多态
        mIMODEL = new Model();
    }

    //MainView里会用到这个方法，就是把数据从view传到presenter。
    public void deliverDataFromViewToModel(String words) {
        //iModel = new Model();
        //model就是操作数据的地方。
        mIMODEL.writeDataToDB(words);
    }

    public void deliverDataFromModeltoView() {
        Bean bean = mIMODEL.getDataFromDB();
        mIView.setWordsOnTheScreen(bean.getWordsFromBean());

    }

}
