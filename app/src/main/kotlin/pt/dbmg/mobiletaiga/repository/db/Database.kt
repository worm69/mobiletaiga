package pt.dbmg.mobiletaiga.repository.db

import androidx.room.Database
import androidx.room.RoomDatabase
import pt.dbmg.mobiletaiga.repository.data.User


@Database(entities = arrayOf(User::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}