package com.example.androiddevchallenge.ui.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.data.model.Cat
import com.example.androiddevchallenge.data.provideCats
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun DetailView(cat: Cat) {
    Image(
        modifier = Modifier
            .aspectRatio(16f / 9f)
            .fillMaxWidth(),
        painter = painterResource(id = cat.image),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        DetailView(provideCats().first())
    }
}