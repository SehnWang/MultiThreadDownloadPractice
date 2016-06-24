package com.xhao.download;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.xhao.download.entity.FileInfo;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView fileNameText;
    private Button buttonStart;
    private Button buttonStop;

    private ProgressBar mProgressBar;

    private FileInfo fileInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        initView();

    }

    private void init() {
        //初始化创建一个文件
        fileInfo = new FileInfo(0, "", "", 0, 0);
    }

    private void initView() {
        fileNameText = (TextView) findViewById(R.id.file_name);
        fileNameText.setText(fileInfo.getFileName());
        buttonStart = (Button) findViewById(R.id.button_start);
        buttonStart.setOnClickListener(this);
        buttonStop = (Button) findViewById(R.id.button_stop);
        buttonStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_start://开始下载

                break;
            case R.id.button_stop://停止下载

                break;

        }
    }
}
