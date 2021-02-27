package com.example.androiddevchallenge.ui.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.androiddevchallenge.data.model.Cat
import com.example.androiddevchallenge.ui.theme.MyTheme

class DetailActivity : AppCompatActivity() {
    private val cat: Cat by lazy {
        intent?.getParcelableExtra(EXTRA_CAT) as? Cat ?: error("No Cat provided :(")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                DetailView(cat)
            }
        }
        title = cat.name
    }

    companion object {
        private const val EXTRA_CAT = "CAT"

        fun newIntent(
            context: Context,
            cat: Cat
        ) = Intent(context, DetailActivity::class.java)
            .putExtra(EXTRA_CAT, cat)
    }

}
