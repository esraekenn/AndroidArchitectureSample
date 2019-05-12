package io.androidedu.androidarchitecturesample.datalayer.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "WeatherItem")
data class WeatherItem(

    @ColumnInfo
    @PrimaryKey(autoGenerate = true)
    val _id: Long = 0L,

    @ColumnInfo
    @field:SerializedName("icon")
    val icon: String,

    @ColumnInfo
    @field:SerializedName("description")
    val description: String,

    @ColumnInfo
    @field:SerializedName("main")
    val main: String,

    @ColumnInfo
    @field:SerializedName("id")
    val id: Int
)