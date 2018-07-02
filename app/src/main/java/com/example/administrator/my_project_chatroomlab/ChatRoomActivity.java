package com.example.administrator.my_project_chatroomlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class ChatRoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        getSupportActionBar().hide(); //隱藏標題
        getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_FULLSCREEN); //隱藏狀態

        setContentView( R.layout.activity_chat_room );
        LinearLayout logo =findViewById( R.id.logo );
        Animation fadein = AnimationUtils.loadAnimation( this, R.anim.fadein );
        logo.setAnimation( fadein );
        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                try{
                    sleep( 1000 );
                }catch(Exception e){
                    e.printStackTrace();
                }finally {
                    startActivity( new Intent( ChatRoomActivity.this,LoginActivity.class ));
                    finish();
                }
            }
        };
        thread.start();
    }
}
