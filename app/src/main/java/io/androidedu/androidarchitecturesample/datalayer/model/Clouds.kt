package io.androidedu.androidarchitecturesample.datalayer.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Clouds")
data class Clouds(

    @ColumnInfo
    @PrimaryKey(autoGenerate = true)
    val _id: Long = 0L,

    @ColumnInfo
    @field:SerializedName("all")
    val all: Int
)