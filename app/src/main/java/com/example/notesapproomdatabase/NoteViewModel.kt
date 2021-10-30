package com.example.notesapproomdatabase

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// it is moderator between UI and Data
class NoteViewModel(application: Application) : AndroidViewModel(application) {
    val allNotes : LiveData<List<Notes>>
    private val repository : NoteRepository


    init {
        val dao = NoteDataBase.getDatabase(application).getNoteDao()
        repository = NoteRepository(dao)
        allNotes = repository.allNotes
    }

    fun updateNote(note: Notes)=viewModelScope.launch (Dispatchers.IO) {
        repository.update(note)
    }
    fun insertNote(note:Notes) = viewModelScope.launch ( Dispatchers.IO ){
        repository.insert(note)
    }

    fun deleteNote(note: Notes) = viewModelScope.launch(Dispatchers.IO){
        repository.delete(note)
    }
    // the Dispatchers IO in kotlin coroutines mean task preformed in IO thread as background thread
    // if we want the task in main thread we use Dispatchers.Main
}