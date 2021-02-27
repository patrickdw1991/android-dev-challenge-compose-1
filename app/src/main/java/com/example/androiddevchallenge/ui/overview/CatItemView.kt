package com.example.androiddevchallenge.ui.overview

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.model.Cat
import com.example.androiddevchallenge.data.provideCats
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun CatItemView(
    cat: Cat,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable(onClick = onClick)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                modifier = Modifier
                    .width(80.dp)
                    .height(80.dp),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = cat.image),
                contentDescription = null
            )
            Text(
                modifier = Modifier.padding(8.dp),
                text = cat.name
            )
        }
    }
}

@Preview("Light Theme", widthDp = 360)
@Composable
fun PreviewItem() {
    MyTheme {
        CatItemView(provideCats().first()) { }
    }
}