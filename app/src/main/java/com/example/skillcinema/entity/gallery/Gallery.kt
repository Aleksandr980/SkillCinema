package com.example.skillcinema.entity.gallery

import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@kotlinx.parcelize.Parcelize
data class Gallery(
    @SerializedName("imageUrl")
    val imageUrl: String,
    @SerializedName("previewUrl")
    val previewUrl: String
) : Parcelable

