package com.example.skillcinema.entity.actor_person;

import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015\u00a2\u0006\u0002\u0010\u0019J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\u00ca\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00052\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015H\u00c6\u0001\u00a2\u0006\u0002\u0010BJ\t\u0010C\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010GH\u00d6\u0003J\t\u0010H\u001a\u00020\u0003H\u00d6\u0001J\t\u0010I\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00138\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00158\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001d\u00a8\u0006O"}, d2 = {"Lcom/example/skillcinema/entity/actor_person/ActorPerson;", "Landroid/os/Parcelable;", "personId", "", "webUrl", "", "nameRu", "nameEn", "sex", "posterUrl", "growth", "birthday", "death", "age", "birthplace", "deathplace", "hasAwards", "profession", "facts", "", "spouses", "", "Lcom/example/skillcinema/entity/actor_person/PersonResponse_spouses;", "films", "Lcom/example/skillcinema/entity/actor_person/PersonResponse_films;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAge", "()I", "getBirthday", "()Ljava/lang/String;", "getBirthplace", "getDeath", "getDeathplace", "getFacts", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getFilms", "()Ljava/util/List;", "getGrowth", "getHasAwards", "getNameEn", "getNameRu", "getPersonId", "getPosterUrl", "getProfession", "getSex", "getSpouses", "getWebUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/example/skillcinema/entity/actor_person/ActorPerson;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@kotlinx.parcelize.Parcelize()
public final class ActorPerson implements android.os.Parcelable {
    @com.google.gson.annotations.SerializedName(value = "personId")
    private final int personId = 0;
    @com.google.gson.annotations.SerializedName(value = "webUrl")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String webUrl = null;
    @com.google.gson.annotations.SerializedName(value = "nameRu")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nameRu = null;
    @com.google.gson.annotations.SerializedName(value = "nameEn")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String nameEn = null;
    @com.google.gson.annotations.SerializedName(value = "sex")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sex = null;
    @com.google.gson.annotations.SerializedName(value = "posterUrl")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String posterUrl = null;
    @com.google.gson.annotations.SerializedName(value = "growth")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String growth = null;
    @com.google.gson.annotations.SerializedName(value = "birthday")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String birthday = null;
    @com.google.gson.annotations.SerializedName(value = "death")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String death = null;
    @com.google.gson.annotations.SerializedName(value = "age")
    private final int age = 0;
    @com.google.gson.annotations.SerializedName(value = "birthplace")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String birthplace = null;
    @com.google.gson.annotations.SerializedName(value = "deathplace")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String deathplace = null;
    @com.google.gson.annotations.SerializedName(value = "hasAwards")
    private final int hasAwards = 0;
    @com.google.gson.annotations.SerializedName(value = "profession")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String profession = null;
    @com.google.gson.annotations.SerializedName(value = "facts")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String[] facts = null;
    @com.google.gson.annotations.SerializedName(value = "spouses")
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.skillcinema.entity.actor_person.PersonResponse_spouses> spouses = null;
    @com.google.gson.annotations.SerializedName(value = "films")
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.skillcinema.entity.actor_person.PersonResponse_films> films = null;
    
    public ActorPerson(int personId, @org.jetbrains.annotations.NotNull()
    java.lang.String webUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String nameRu, @org.jetbrains.annotations.NotNull()
    java.lang.String nameEn, @org.jetbrains.annotations.NotNull()
    java.lang.String sex, @org.jetbrains.annotations.NotNull()
    java.lang.String posterUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String growth, @org.jetbrains.annotations.NotNull()
    java.lang.String birthday, @org.jetbrains.annotations.NotNull()
    java.lang.String death, int age, @org.jetbrains.annotations.NotNull()
    java.lang.String birthplace, @org.jetbrains.annotations.NotNull()
    java.lang.String deathplace, int hasAwards, @org.jetbrains.annotations.NotNull()
    java.lang.String profession, @org.jetbrains.annotations.NotNull()
    java.lang.String[] facts, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.skillcinema.entity.actor_person.PersonResponse_spouses> spouses, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.skillcinema.entity.actor_person.PersonResponse_films> films) {
        super();
    }
    
    public final int getPersonId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWebUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameRu() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameEn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPosterUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGrowth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBirthday() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeath() {
        return null;
    }
    
    public final int getAge() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBirthplace() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeathplace() {
        return null;
    }
    
    public final int getHasAwards() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProfession() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getFacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.skillcinema.entity.actor_person.PersonResponse_spouses> getSpouses() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.skillcinema.entity.actor_person.PersonResponse_films> getFilms() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.skillcinema.entity.actor_person.PersonResponse_spouses> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.skillcinema.entity.actor_person.PersonResponse_films> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.skillcinema.entity.actor_person.ActorPerson copy(int personId, @org.jetbrains.annotations.NotNull()
    java.lang.String webUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String nameRu, @org.jetbrains.annotations.NotNull()
    java.lang.String nameEn, @org.jetbrains.annotations.NotNull()
    java.lang.String sex, @org.jetbrains.annotations.NotNull()
    java.lang.String posterUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String growth, @org.jetbrains.annotations.NotNull()
    java.lang.String birthday, @org.jetbrains.annotations.NotNull()
    java.lang.String death, int age, @org.jetbrains.annotations.NotNull()
    java.lang.String birthplace, @org.jetbrains.annotations.NotNull()
    java.lang.String deathplace, int hasAwards, @org.jetbrains.annotations.NotNull()
    java.lang.String profession, @org.jetbrains.annotations.NotNull()
    java.lang.String[] facts, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.skillcinema.entity.actor_person.PersonResponse_spouses> spouses, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.skillcinema.entity.actor_person.PersonResponse_films> films) {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
}