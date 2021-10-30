package com.example.notesapproomdatabase

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class NoteAdapter(private val NoteVM:NoteViewModel) : RecyclerView.Adapter<NoteAdapter.NoteviewHolder>() {
     private val allnote = ArrayList<Notes>()

    class NoteviewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

        val textView: TextView = itemView.findViewById(R.id.TexttRecevMain)
        val titleView:TextView = itemView.findViewById(R.id.textRecevTitle)
        val deleteButton : ImageView = itemView.findViewById(R.id.deleteButton)
        val timeshwon: TextView = itemView.findViewById(R.id.textshownhere)
        val dateshown:TextView=itemView.findViewById(R.id.textRecevDate)
        val checkboxthis:CheckBox=itemView.findViewById(R.id.checkbox1)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteviewHolder {
       val viewHolder = NoteviewHolder(LayoutInflater.from(parent.context).inflate
           (R.layout.item_note,parent,false))

        return viewHolder
    }

    override fun onBindViewHolder(holder: NoteviewHolder, position: Int) {
        val currentItem = allnote[position]
        holder.textView.text= currentItem.text
        holder.titleView.text= currentItem.title1000
        holder.dateshown.text=currentItem.DateEn
        holder.timeshwon.text=currentItem.Time
        holder.checkboxthis.isChecked=currentItem.checkbox
        if (currentItem.checkbox == true) {
            holder.checkboxthis.isChecked = true
        }
        if (currentItem.Time<timenow()){
            holder.checkboxthis.isEnabled = false
        }

        holder.checkboxthis.setOnCheckedChangeListener { _, ischeeck ->
            if (ischeeck) {
                currentItem.checkbox = true
                NoteVM.updateNote(currentItem)
            }else{
                currentItem.checkbox=false
                NoteVM.updateNote(currentItem)
            }
        }
        holder.deleteButton.setOnClickListener {


            NoteVM.deleteNote(currentItem)


        }

    }
    fun timenow():String{
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
        val formatted = current.format(formatter)
           return formatted
    }


    override fun getItemCount(): Int {
        return allnote.size
    }
    //update our items
    fun update(newData: List<Notes>){
        allnote.clear()
        allnote.addAll(newData)
        notifyDataSetChanged()
    }
     // set click on delete button

}