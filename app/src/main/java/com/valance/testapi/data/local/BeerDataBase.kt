package com.valance.testapi.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    exportSchema = false,
    entities = [BeerEntity::class],
    version = 1
)
abstract class BeerDataBase : RoomDatabase() {
    abstract val dao: BeerDao
}