//package io.androidedu.androidarchitecturesample.datalayer.localdb
//
//import android.content.Context
//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase
//import io.androidedu.androidarchitecturesample.datalayer.model.*
//
//
//// Code with ❤️
////┌─────────────────────────────┐
////│ Created by Gökhan ÖZTÜRK    │
////│ ─────────────────────────── │
////│ GokhanOzturk@AndroidEdu.IO  │
////│ ─────────────────────────── │
////│ 2019-05-11 - 10:42          │
////└─────────────────────────────┘
//
//@Database(
//    entities = [
//        City::class,
//        Clouds::class,
//        Coord::class,
//        ListItem::class,
//        Main::class,
//        Rain::class,
//        Sys::class,
//        WeatherItem::class,
//        Wind::class],
//    version = 1
//)
//abstract class WeatherDB : RoomDatabase() {
//
////    abstract fun youtubeDAO(): YoutubeDAO
//
//    companion object {
//        private var INSTANCE: WeatherDB? = null
//
//        fun getInstance(context: Context): WeatherDB? {
//
//            if (INSTANCE == null) {
//                synchronized(WeatherDB::class) {
//
//                    INSTANCE = Room.databaseBuilder(
//                        context.applicationContext,
//                        WeatherDB::class.java, "db_weather"
//                    )
//                        .fallbackToDestructiveMigration()
//                        .build()
//                }
//            }
//            return INSTANCE
//        }
//    }
//}