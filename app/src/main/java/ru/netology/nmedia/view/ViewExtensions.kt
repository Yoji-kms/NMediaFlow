package ru.netology.nmedia.view

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation
import com.bumptech.glide.load.resource.bitmap.CircleCrop

fun ImageView.load(
    url: String,
    placeholderId: Int,
    errorId: Int,
    vararg transforms: BitmapTransformation = emptyArray()
) =
    Glide.with(this)
        .load(url)
        .placeholder(placeholderId)
        .error(errorId)
        .timeout(10_000)
        .transform(*transforms)
        .into(this)

fun ImageView.loadCircleCrop(
    url: String,
    placeholderId: Int,
    errorId: Int,
    vararg transforms: BitmapTransformation = emptyArray()
) =
    load(url, placeholderId, errorId, CircleCrop(), *transforms)
