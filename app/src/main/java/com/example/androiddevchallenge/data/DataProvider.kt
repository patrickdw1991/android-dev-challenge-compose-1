package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.model.Cat

fun provideCats(): List<Cat> = listOf(
    Cat(
        "Paw",
        R.drawable.cat1,
        "Named like this due to his cute paws, lovely as he is his previous owners didn't want him anymore due to time constraints."
    ),
    Cat(
        "Meow",
        R.drawable.cat2,
        "Voice like an angel and just so nice to look at , you will love her."
    ),
    Cat(
        "Pinky",
        R.drawable.cat3,
        "Has an extra pinky which makes it quite a weird cat."
    ),
    Cat(
        "Catty",
        R.drawable.cat4,
        "Boring cat, nobody likes this one but well if you like boring cats please choose this one :)"
    ),
    Cat(
        "Simba",
        R.drawable.cat5,
        "Do you like the lion king? Well in that case this is the cat for you!"
    ),
    Cat(
        "Cool cat",
        R.drawable.cat6,
        "Coolest cat in town, if you are cool and like a cool cat this is the cat for you!"
    ),
    Cat(
        "Poesje",
        R.drawable.cat7,
        "Just speaks Cat Dutch so would only consider if you are either speaking or learning to speak Dutch."
    ),
)
