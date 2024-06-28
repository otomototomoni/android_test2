package com.example.hellosample

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //表示ボタンであるButtonオブジェクトを取得
        val btClick = findViewById<Button>(R.id.btClick)
        //リスナクラスのインスタンスを生成
        val listener = HelloListener()
        //表示ボタンにリスナを設定
        btClick.setOnClickListener(listener)
    }

    //ボタンをクリックしたときのリスナクラス
    private inner class HelloListener : View.OnClickListener {
        override fun onClick(view: View) {
            //名前入力欄であるEditTextオブジェクトを取得
            val input = findViewById<EditText>(R.id.etName)
            //メッセージを表示するTextViewオブジェクトを取得
            val output = findViewById<TextView>(R.id.btClick)
            //入力された名前文字列を取得
            val inputStr = input.text.toString()
            //メッセージを表示
            output.text = inputStr + "さん、こんにちは！"
        }
    }
}