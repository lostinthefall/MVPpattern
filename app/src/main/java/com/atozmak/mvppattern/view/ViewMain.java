package com.atozmak.mvppattern.view;

import android.support.v4.text.TextUtilsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.atozmak.mvppattern.R;
import com.atozmak.mvppattern.presenter.Presenter;

import android.text.TextUtils;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ViewMain extends AppCompatActivity implements IView {

    Presenter presenter;
    @Bind(R.id.etM)
    EditText et;
    @Bind(R.id.tvM)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_view);
        ButterKnife.bind(this);


        presenter = new Presenter(this);
        //把数据存到presenter
        presenter.deliverDataFromViewToModel(getDataFromView());
        //把数据从presenter拿出来
        presenter.deliverDataFromModeltoView();


        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                setDataOnTheScreen(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }


    //在这里把获得的数据显示在view上
    @Override
    public void setDataOnTheScreen(String words) {
        tv.setText(words);
    }

    @Override
    public String getDataFromView() {
        if (TextUtils.isEmpty(et.getText().toString())) {
            return "哈哈哈123~~~~";
        } else {
            return et.getText().toString();
        }
    }
}
