package io.androidedu.androidarchitecturesample.datalayer.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Coord")
data class Coord(

    @ColumnInfo
    @PrimaryKey(autoGenerate = true)
    val _id: Long = 0L,

    @ColumnInfo
    @field:SerializedName("lon")
    val lon: Double,

    @ColumnInfo
    @field:SerializedName("lat")
    val lat: Double
)