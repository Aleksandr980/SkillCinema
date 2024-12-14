package com.example.skillcinema.entity.similarsMovie

import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@kotlinx.parcelize.Parcelize
data class SimilarsMovie(
    @SerializedName("filmId")
    val filmId: Int,
    @SerializedName("nameRu")
    val nameRu: String,
    @SerializedName("nameEn")
    val nameEn: String,
    @SerializedName("nameOriginal")
    val nameOriginal: String,
    @SerializedName("posterUrl")
    val posterUrl: String,
    @SerializedName("posterUrlPreview")
    val posterUrlPreview: String,
    @SerializedName("relationType")
    val relationType: String
) : Parcelable

