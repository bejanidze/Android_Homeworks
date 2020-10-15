package com.example.movies
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        submitBtn.setOnClickListener {
            submitUserName()
            val intent = Intent(this, MovieListActivity::class.java)
            intent.putExtra("userName", textView.text.toString())
            startActivity(intent)
        }
    }

    private fun submitUserName(){
        var userName = textView.text.toString()
        textView.setText(userName)
//        println(userName)
    }
}