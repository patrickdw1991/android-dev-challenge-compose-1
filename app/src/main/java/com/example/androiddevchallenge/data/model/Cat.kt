package com.example.androiddevchallenge.data.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class Cat(
    val name: String,
    @DrawableRes val image: Int,
    val description: String
) : Parcelable
