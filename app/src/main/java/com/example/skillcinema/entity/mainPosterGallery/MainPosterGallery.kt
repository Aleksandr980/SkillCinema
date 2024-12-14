package com.example.skillcinema.entity.mainPosterGallery

import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@kotlinx.parcelize.Parcelize
data class MainPosterGallery(
    @SerializedName("imageUrl")
    val imageUrl: String,
    @SerializedName("previewUrl")
    val previewUrl: String,
) : Parcelable

