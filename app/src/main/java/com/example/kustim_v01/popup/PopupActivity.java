package com.example.kustim_v01.popup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.example.kustim_v01.LocationActivity;
import com.example.kustim_v01.PromiseRegisterActivity;
import com.example.kustim_v01.R;

import java.util.HashMap;
import java.util.Map;

public class PopupActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //타이틀바 없애기
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.popup_activity2);

        //UI 객체생성

        //데이터 가져오기
//        Intent intent = getIntent();
//        String data = intent.getStringExtra("data");
//        txtText.setText(data);
    }


//    //확인 버튼 클릭
//    public void mOnClose(View v) {
//        //데이터 전달하기
//        Intent intent = new Intent();
//        intent.putExtra("result", "Close Popup");
//        setResult(RESULT_OK, intent);
//
//        //액티비티(팝업) 닫기
//        finish();
//    }

        //확인 버튼 클릭
    public void mOnClose(View v) {


        if (v.getId() == R.id.promise_accept2) {

                Intent intent = new Intent(this, PromiseRegisterActivity.class);
                startActivity(intent);
            }
            //데이터 전달하기
            if (v.getId() == R.id.promise_refuse2) {

                //액티비티(팝업) 닫기
                finish();
            }
        }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //바깥레이어 클릭시 안닫히게
        if (event.getAction() == MotionEvent.ACTION_OUTSIDE) {
            return false;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        //안드로이드 백버튼 막기
        return;
    }

}
