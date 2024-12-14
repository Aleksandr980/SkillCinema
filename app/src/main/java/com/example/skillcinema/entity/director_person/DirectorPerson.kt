package com.example.skillcinema.entity.director_person

import android.os.Parcelable
import com.google.gson.annotations.SerializedName


@kotlinx.parcelize.Parcelize
data class DirectorPerson(
    @SerializedName("personId")
    val personId: Int,
    @SerializedName("webUrl")
    val webUrl: String,
    @SerializedName("nameRu")
    val nameRu: String,
    @SerializedName("nameEn")
    val nameEn: String,
    @SerializedName("sex")
    val sex: String,
    @SerializedName("posterUrl")
    val posterUrl: String,
    @SerializedName("growth")
    val growth: String,
    @SerializedName("birthday")
    val birthday: String,
    @SerializedName("death")
    val death: String,
    @SerializedName("age")
    val age: Int,
    @SerializedName("birthplace")
    val birthplace: String,
    @SerializedName("deathplace")
    val deathplace: String,
    @SerializedName("hasAwards")
    val hasAwards: Int,
    @SerializedName("profession")
    val profession: String,
    @SerializedName("facts")
    val facts: Array<String>,
    @SerializedName("spouses")
    val spouses: List<PersonResponse_spouses>,
    @SerializedName("films")
    val films: List<PersonResponse_films>
) : Parcelable

@kotlinx.parcelize.Parcelize
data class PersonResponse_spouses(
    @SerializedName("personId")
    val personId: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("divorced")
    val divorced: String,
    @SerializedName("divorcedReason")
    val divorcedReason: String,
    @SerializedName("sex")
    val sex: String,
    @SerializedName("children")
    val children: String,
    @SerializedName("webUrl")
    val webUrl: String,
    @SerializedName("relation")
    val relation: String,
): Parcelable

@kotlinx.parcelize.Parcelize
data class PersonResponse_films(
    @SerializedName("filmId")
    val filmId: Int,
    @SerializedName("nameRu")
    val nameRu: String,
    @SerializedName("nameEn")
    val nameEn: String,
    @SerializedName("rating")
    val rating: String,
    @SerializedName("general")
    val general: Boolean,
    @SerializedName("description")
    val description: String,
    @SerializedName("professionKey")
    val professionKey: String,

): Parcelable

