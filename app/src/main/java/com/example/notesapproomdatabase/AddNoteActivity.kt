package com.example.notesapproomdatabase

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.navigation.navArgs
import java.util.*

class AddNoteActivity : AppCompatActivity() {
    private lateinit var viewModel: NoteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)
        viewModel = ViewModelProvider(this).get(NoteViewModel::class.java)


        val time1:TextView=findViewById(R.id.textTime)
        val mTimePicker: TimePickerDialog
        val mcurrentTime = Calendar.getInstance()
        val hour = mcurrentTime.get(Calendar.HOUR_OF_DAY)
        val minute = mcurrentTime.get(Calendar.MINUTE)

        mTimePicker = TimePickerDialog(this, object : TimePickerDialog.OnTimeSetListener {
            override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {

                time1.setText(String.format("%d : %d", hourOfDay, minute))
            }
        }, hour, minute, true)

        time1.setOnClickListener{
            mTimePicker.show()
        }

        val dateto0:TextView= findViewById(R.id.dateTake)
        val c = Calendar.getInstance()
        val day = c.get(Calendar.DAY_OF_MONTH)
        val month = c.get(Calendar.MONTH)
        val year = c.get(Calendar.YEAR)

        var brithday = ""
        dateto0.setOnClickListener {
            val datet0 = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, y, m, d ->
                brithday = "$d-${m}-$y"
                dateto0.setText(brithday)

            }, year, month, day)
                    datet0.datePicker.minDate = c.timeInMillis
                datet0.show()

        }
        val btn: Button = findViewById(R.id.btnAddNote)
        btn.setOnClickListener {


            addingNote(dateto0.text.toString(),time1.text.toString())
        }

    }

    private fun addingNote(datett:String,timetho:String) {
        val title: EditText = findViewById(R.id.title1)
        val input2v = title.text.toString()
        val editText: EditText = findViewById(R.id.input)
        val input = editText.text.toString()
        if (input.isNotEmpty()) {
            viewModel.insertNote(Notes(input, input2v,datett,timetho,false))

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}


