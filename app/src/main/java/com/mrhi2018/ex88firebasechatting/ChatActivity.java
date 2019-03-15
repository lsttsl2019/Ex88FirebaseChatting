package com.mrhi2018.ex88firebasechatting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        Toast.makeText(this, G.nickName+"\n"+G.profileUrl, Toast.LENGTH_SHORT).show();
    }
}
