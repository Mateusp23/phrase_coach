package com.example.phrasecoach.ui.repository

import android.content.Context
import com.example.phrasecoach.R
import com.example.phrasecoach.ui.constants.PhraseConstants
import java.util.*

data class Phrase (
    val description: String,
    val category: Int
)

class Mock (val context: Context) {

    private val ALL = PhraseConstants.PHRASEFILTER.ALL

    private val mListPhrases: List<Phrase> = listOf(
        Phrase(context.getString(R.string.phrase_1), ALL),
        Phrase(context.getString(R.string.phrase_2), ALL),
        Phrase(context.getString(R.string.phrase_3), ALL),
        Phrase(context.getString(R.string.phrase_4), ALL),
        Phrase(context.getString(R.string.phrase_5), ALL),
        Phrase(context.getString(R.string.phrase_6), ALL),
        Phrase(context.getString(R.string.phrase_7), ALL),
        Phrase(context.getString(R.string.phrase_8), ALL),
        Phrase(context.getString(R.string.phrase_9), ALL),
        Phrase(context.getString(R.string.phrase_10), ALL),
        Phrase(context.getString(R.string.phrase_11), ALL),
        Phrase(context.getString(R.string.phrase_12), ALL),
        Phrase(context.getString(R.string.phrase_13), ALL),
        Phrase(context.getString(R.string.phrase_14), ALL),
        Phrase(context.getString(R.string.phrase_15), ALL),
    )

    fun getPhrase (categoryId: Int): String {
        val filtered = mListPhrases.filter { (categoryId == ALL) }
        val rand = Random().nextInt(filtered.size)

        return filtered[rand].description
    }
}