package com.example.notesapproomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.security.AccessControlContext

@Database(entities = [Notes::class],version = 1,exportSchema = false)
abstract class NoteDataBase :RoomDatabase() {
    // we will access our dao through database
     abstract fun getNoteDao() : NotesDao

     // we will make single instence of room to it prevent multiple opening of database at some time
     companion object{
         @Volatile
         private var INSTANCE : NoteDataBase? = null
         fun getDatabase(context: Context) : NoteDataBase{
             return INSTANCE ?: synchronized(this){
                 val instance = Room.databaseBuilder(
                     context.applicationContext,
                     NoteDataBase::class.java,
                 "note_database"
                 ).build()
                 INSTANCE = instance
                 instance
             }
         }

     }
}