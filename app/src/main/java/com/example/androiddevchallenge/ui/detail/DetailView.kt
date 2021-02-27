package com.example.androiddevchallenge.ui.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.model.Cat
import com.example.androiddevchallenge.data.provideCats
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun DetailView(cat: Cat, adoptCatClicked: () -> Unit) {
    Column {
        Image(
            modifier = Modifier
                .aspectRatio(16f / 9f)
                .fillMaxWidth(),
            painter = painterResource(id = cat.image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier.padding(16.dp).fillMaxHeight(),
        ) {
            Text(text = cat.description)
            Spacer(modifier = Modifier.weight(1.0f))
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                onClick = adoptCatClicked
            ) {
                Text("Adopt me <3")
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        DetailView(provideCats().first()) { }
    }
}