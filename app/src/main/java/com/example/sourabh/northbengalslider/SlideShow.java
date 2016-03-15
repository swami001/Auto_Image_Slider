package com.example.sourabh.northbengalslider;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

public class SlideShow extends Activity{
    private ImageView imageView;
    int i=0;
    int imgid[]={R.drawable.amazon_icon,R.drawable.amazon_kindle,R.drawable.applications_icon,
            R.drawable.cookies_icon,R.drawable.filehippo_icon,R.drawable.firefoxbeta_icon,
            R.drawable.nba_icon,R.drawable.ninjas_icon,R.drawable.paprika_icon,
            R.drawable.solarwalk_icon,R.drawable.unrarx_icon,R.drawable.vuze_icon};
    RefreshHandler refreshHandler=new RefreshHandler();

    class RefreshHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {
            // TODO Auto-generated method stub
            SlideShow.this.updateUI();
        }
        public void sleep(long delayMillis){
            this.removeMessages(0);
            sendMessageDelayed(obtainMessage(0), delayMillis);
        }
    };
    public void updateUI(){
            refreshHandler.sleep(100);
            if(i<imgid.length){
                imageView.setImageResource(imgid[i]);
                i++;
            }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_show);
        this.imageView=(ImageView)this.findViewById(R.id.imageView);
        updateUI();
    }

}
