package com.example.supeheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.supeheroes.R

data class Hero(
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
     @DrawableRes val imageRes: Int
)


