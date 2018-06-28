package com.example.administrator.my_project_chatroomlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class ChatRoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_chat_room );
        LinearLayout logo =findViewById( R.id.logo );
        Animation fadein = AnimationUtils.loadAnimation( this, R.anim.fadein );
        logo.setAnimation( fadein );
        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                try{
                    sleep( 15000 );
                }catch(Exception e){
                    e.printStackTrace();
                }finally {
                    startActivity( new Intent( ChatRoomActivity.this,MainActivity.class ));
                    finish();
                }
            }
        };
        thread.start();
    }
}
    }
}
