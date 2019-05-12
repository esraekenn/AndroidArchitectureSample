package io.androidedu.androidarchitecturesample.datalayer.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "City")
data class City(

    @ColumnInfo
    @PrimaryKey(autoGenerate = true)
    val _id: Long = 0L,

    @ColumnInfo
    @field:SerializedName("country")
    val country: String,

    @ColumnInfo
    @field:SerializedName("coord")
    val coord: Coord,

    @ColumnInfo
    @field:SerializedName("name")
    val name: String,

    @ColumnInfo
    @field:SerializedName("id")
    val id: Int,

    @ColumnInfo
    @field:SerializedName("population")
    val population: Int
)