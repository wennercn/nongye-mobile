package com.wztnet.nongye.mobile;

//import android.app.Activity;
import android.os.Bundle;
import org.apache.cordova.*;


public class Main extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  
    	super.setIntegerProperty("splashscreen", R.drawable.splash);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}
