package com.example.tic_tac_toe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log.d
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var firstPlayer = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        button00.setOnClickListener {
            buttonChange(button00)
        }
        button01.setOnClickListener {
            buttonChange(button01)
        }
        button02.setOnClickListener {
            buttonChange(button02)
        }
        button10.setOnClickListener {
            buttonChange(button10)
        }
        button11.setOnClickListener {
            buttonChange(button11)
        }
        button12.setOnClickListener {
            buttonChange(button12)
        }
        button20.setOnClickListener {
            buttonChange(button20)
        }
        button21.setOnClickListener {
            buttonChange(button21)
        }
        button22.setOnClickListener {
            buttonChange(button22)
        }
        resetbutton.setOnClickListener {
            button00.text = ""
            button01.text = ""
            button02.text = ""
            button10.text = ""
            button11.text = ""
            button12.text = ""
            button20.text = ""
            button21.text = ""
            button22.text = ""
            button00.isClickable = true
            button01.isClickable = true
            button02.isClickable = true
            button10.isClickable = true
            button11.isClickable = true
            button12.isClickable = true
            button20.isClickable = true
            button21.isClickable = true
            button22.isClickable = true

        }
    }

    private fun buttonChange(button: Button) {
        if (firstPlayer) {
            button.text = "X"
        } else {
            button.text = "O"
        }
        button.isClickable = false
        firstPlayer = !firstPlayer
        checkWinner()
    }

    private fun checkWinner() {
        if (button00.text.toString()
                .isNotEmpty() && button00.text.toString() == button01.text.toString() && button00.text.toString() == button02.text.toString()
        ) {
            showToast(button00)
            notClickable()
        } else if (button10.text.toString()
                .isNotEmpty() && button10.text.toString() == button11.text.toString() && button10.text.toString() == button12.text.toString()
        ) {
            showToast(button10)
            notClickable()
        } else if (button20.text.toString()
                .isNotEmpty() && button20.text.toString() == button21.text.toString() && button21.text.toString() == button22.text.toString()
        ) {
            showToast(button20)
            notClickable()
        } else if (button00.text.toString()
                .isNotEmpty() && button00.text.toString() == button10.text.toString() && button00.text.toString() == button20.text.toString()
        ) {
            showToast(button00)
            notClickable()
        } else if (button01.text.toString()
                .isNotEmpty() && button01.text.toString() == button11.text.toString() && button01.text.toString() == button21.text.toString()
        ) {
            showToast(button01)
            notClickable()
        } else if (button02.text.toString()
                .isNotEmpty() && button02.text.toString() == button12.text.toString() && button02.text.toString() == button22.text.toString()
        ) {
            showToast(button02)
            notClickable()
        } else if (button00.text.toString()
                .isNotEmpty() && button00.text.toString() == button11.text.toString() && button00.text.toString() == button22.text.toString()
        ) {
            showToast(button00)
            notClickable()
        } else if (button20.text.toString()
                .isNotEmpty() && button20.text.toString() == button11.text.toString() && button20.text.toString() == button02.text.toString()
        ) {
            showToast(button20)
            notClickable()
        } else if (button00.text.toString()
                .isNotEmpty() && button01.text.toString().isNotEmpty() && button02.text.toString()
                .isNotEmpty() && button10.text.toString().isNotEmpty() && button11.text.toString()
                .isNotEmpty() && button12.text.toString().isNotEmpty() && button20.text.toString()
                .isNotEmpty() && button21.text.toString().isNotEmpty() && button22.text.toString()
                .isNotEmpty()
        ) {
            Toast.makeText(this, "No one is winner!", Toast.LENGTH_SHORT).show()
            notClickable()
        }

    }

    private fun showToast(button: Button){
        Toast.makeText(this , "Winner is ${button.text}", Toast.LENGTH_SHORT).show()
    }
  private fun notClickable(){
      button00.isClickable = false
      button01.isClickable = false
      button02.isClickable = false
      button10.isClickable = false
      button11.isClickable = false
      button12.isClickable = false
      button20.isClickable = false
      button21.isClickable = false
      button22.isClickable = false
  }
    }








