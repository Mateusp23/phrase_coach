package com.example.phrasecoach.ui.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.phrasecoach.R
import com.example.phrasecoach.ui.constants.PhraseConstants
import com.example.phrasecoach.ui.repository.Mock
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var mPhraseFilter: Int = PhraseConstants.PHRASEFILTER.ALL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handleNewPhrase()
        btnPhrase.setOnClickListener(this)
    }

    private fun handleNewPhrase() {
        tvResult.text = Mock(context = applicationContext).getPhrase(mPhraseFilter)
    }

    override fun onClick(v: View) {
        val id = v.id
        if(id == R.id.btnPhrase){
            handleNewPhrase()
        }
    }
}