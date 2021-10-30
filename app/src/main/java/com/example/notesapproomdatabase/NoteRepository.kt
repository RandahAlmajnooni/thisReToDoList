package com.example.notesapproomdatabase

// it will take dao as constructor

class NoteRepository (private val notesDao: NotesDao){
    val allNotes = notesDao.getAllNotes()

    // define the insert and delete function here
    suspend fun insert(note : Notes){
        notesDao.insert(note)
    }
    suspend fun update(note: Notes){
        notesDao.Update(note)
    }
    suspend fun delete(note: Notes){
        notesDao.delete(note)
    }
}