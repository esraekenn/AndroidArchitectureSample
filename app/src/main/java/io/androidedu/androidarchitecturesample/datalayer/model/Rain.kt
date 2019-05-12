package io.androidedu.androidarchitecturesample.datalayer.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "Rain")
data class Rain(

    @ColumnInfo
    @PrimaryKey(autoGenerate = true)
    val _id: Long = 0L,

    @ColumnInfo(name = "1h")
    @field:SerializedName("1h")
    val jsonMember1h: Double
)