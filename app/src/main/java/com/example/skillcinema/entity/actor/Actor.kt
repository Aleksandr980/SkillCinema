package com.example.skillcinema.entity.actor

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
@kotlinx.parcelize.Parcelize
data class Actor(
    @SerializedName("staffId")
    val staffId: Int? = null,
    @SerializedName("nameRu")
    val nameRu: String? = null,
    @SerializedName("nameEn")
    val nameEn: String? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("posterUrl")
    val posterUrl: String? = null,
    @SerializedName("professionText")
    val professionText: String? = null,
    @SerializedName("professionKey")
    val professionKey: String? = null
) : Parcelable

