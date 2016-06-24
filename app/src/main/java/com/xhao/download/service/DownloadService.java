package com.xhao.download.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.xhao.download.entity.FileInfo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 下载服务
 */
public class DownloadService extends Service {
    private static final String TAG = "DownloadService";
    
    public static final String ACTION_START = "ACTION_START";
    public static final String ACTION_STOP= "ACTION_STOP";
    public static final String ACTION_UPDATE = "ACTION_UPDATE";


    public DownloadService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if(ACTION_START.equals(intent.getAction())){
            //获取传过来的FileInfo数据
            FileInfo fileInfo = (FileInfo) intent.getSerializableExtra("fileInfo");
            Log.i(TAG, "onStartCommand:  Start - >" + fileInfo.toString());
        }else if(ACTION_STOP.equals(intent.getAction())){
            FileInfo fileInfo = (FileInfo) intent.getSerializableExtra("fileInfo");
            Log.i(TAG, "onStartCommand: Stop - >" + fileInfo.toString());
        }
        return super.onStartCommand(intent, flags, startId);
    }


    class InitThread extends Thread{
        private FileInfo mFileInfo;

        public InitThread(FileInfo mFileInfo) {
            this.mFileInfo = mFileInfo;
        }

        @Override
        public void run() {
            try {
                //网络连接
                URL url = new URL(mFileInfo.getUrl());
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setConnectTimeout(3000);
                conn.setRequestMethod("GET");

                int length = 0;
                if(conn.getResponseCode() == HttpURLConnection.HTTP_OK){

                }


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
