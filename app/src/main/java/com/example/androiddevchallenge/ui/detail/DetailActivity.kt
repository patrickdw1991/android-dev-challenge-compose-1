/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
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
                DetailView(cat) {
                    adoptCat()
                }
            }
        }
        title = cat.name
    }

    private fun adoptCat() {
        Toast.makeText(this, "You adopted me!", Toast.LENGTH_SHORT).show()
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
