package com.Phoenix.puding

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.AdapterView
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.Phoenix.puding.databinding.ActivityAddGoalsBinding
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_add_goals.*

class GoalsAddedActivity : AppCompatActivity() {
    lateinit var timeBtn : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goals_added)

        timeBtn = findViewById(R.id.middle_container_colored2)

        timeBtn.setOnClickListener(View.OnClickListener {
            val intent =
                Intent(this, EditGoalsActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        })
    }

    fun backbtn(view: View){
        finish()
    }

}