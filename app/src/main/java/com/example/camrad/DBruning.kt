package com.example.camrad



import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [Start::class],
    version = 1
)
@TypeConverters(Converter::class)
abstract class DBruning : RoomDatabase() {

    abstract fun getRunDao(): StartInterface
}