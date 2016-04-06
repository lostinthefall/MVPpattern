package com.atozmak.mvppattern.bean;

/**
 * Created by Mak on 2016/3/15.
 */
public class Bean {

    private String words;

/*    public Bean(String words) {
        this.words = words;
    }*/

    public Bean() {
    }

    public void setWordsToBean(String words) {
        this.words = words;
    }

    public String getWordsFromBean() {
        return words;
    }


}
