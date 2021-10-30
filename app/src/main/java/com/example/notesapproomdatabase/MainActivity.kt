package com.example.notesapproomdatabase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){
    private lateinit var viewModel: NoteViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel=ViewModelProvider(this).get(NoteViewModel::class.java)
        val recyclerView : RecyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = NoteAdapter(viewModel)
        recyclerView.adapter = adapter


        viewModel.allNotes.observe(this, Observer {
            adapter.update(it)
        })

    }
    fun addNote(view: View) {
        val intent= Intent(this,AddNoteActivity::class.java)
        startActivity(intent)
    }

}