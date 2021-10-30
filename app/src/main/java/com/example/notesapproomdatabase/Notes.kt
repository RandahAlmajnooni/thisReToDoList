package com.example.notesapproomdatabase

import android.widget.Spinner
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// create a table to store our notes
@Entity(tableName = "note_table")
class Notes (@ColumnInfo(name = "text")val text: String,
    //we will access data according to the id of the object
             @ColumnInfo(name = "title") val title1000:String,
             @ColumnInfo(name = "Time")val Time :String,
             @ColumnInfo(name = "cal") val DateEn :String,
             @ColumnInfo(name = "check") var checkbox :Boolean,

             @PrimaryKey (autoGenerate = true )val id: Int = 0)

