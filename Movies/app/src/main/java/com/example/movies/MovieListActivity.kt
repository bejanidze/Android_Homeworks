package com.example.movies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MovieListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userName = intent.getStringExtra("userName")
        textView1.text = userName
        val imageList = listOf<Image>(
            Image(
                R.drawable.img1,
                "Fullmetal Alchemist",
                "When a failed alchemical ritual leaves brothers Edward and Alphonse Elric with severely damaged bodies, they begin searching for the one thing that can save them; the fabled philosopher's stone. "
            ),
            Image(
                R.drawable.img2,
                "Hunter x Hunter",
                " Gon Freecss aspires to become a Hunter, an exceptional being capable of greatness. With his friends and his potential, he seeks for his father who left him when he was younger. "
            ),
            Image(
                R.drawable.img3,
                "Attack on Titan",
                "After his hometown is destroyed and his mother is killed, young Eren Yeager vows to cleanse the earth of the giant humanoid Titans that have brought humanity to the brink of extinction. "
            ),
            Image(
                R.drawable.img4,
                "Vinland Saga",
                " Thorfinn pursues a journey with his father's killer in order to take revenge and end his life in a duel as an honorable warrior and pay his father a homage. "
            ),
            Image(
                R.drawable.img5,
                "One punch man",
                " The story of Saitama, a hero that does it just for fun & can defeat his enemies with a single punch. "
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = CardAdapter(this, imageList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("card", it)
            startActivity(intent)
        }
    }
}