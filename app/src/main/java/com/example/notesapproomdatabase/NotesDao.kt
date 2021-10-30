package com.example.notesapproomdatabase

import androidx.lifecycle.LiveData
import androidx.room.*


// Dao are abstract Class
@Dao
abstract class NotesDao {

     @Insert(onConflict = OnConflictStrategy.IGNORE) // it will ignore duplicated in note table
    abstract suspend fun insert(note:Notes)
    @Update
    abstract suspend fun Update(note: Notes)
    @Delete
    abstract suspend fun delete(note:Notes)
    @Query("SELECT*FROM note_table ORDER BY id ASC") //it will select all data in table according to id ascending order
    abstract fun getAllNotes() : LiveData<List<Notes>> // store data in real time
}