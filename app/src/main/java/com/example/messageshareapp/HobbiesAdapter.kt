package com.example.messageshareapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class HobbiesAdapter(private val hobbies : List<Hobby>) : RecyclerView.Adapter<HobbiesAdapter.HobbiesViewHolder>() {

    // creates a view holder
    // we store view in view holder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbiesViewHolder {

        // Layout inflator will convert the XML into the java object
        val inflator : LayoutInflater = LayoutInflater.from(parent.context)

        // creates a view
        val view : View = inflator.inflate(R.layout.list_item,parent,false)

        // create a view holder and return the view
        return HobbiesViewHolder(view)
    }

    override fun onBindViewHolder(holder: HobbiesViewHolder, position: Int) {

        holder.txtHobby?.text = hobbies[position].title

    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    class HobbiesViewHolder(itemView: View) : ViewHolder(itemView){

        init {
            itemView.findViewById<ImageView>(R.id.imgShare).setOnClickListener{
             Toast.makeText(itemView.context,txtHobby?.text,Toast.LENGTH_SHORT).show()
            }
        }

        var txtHobby: TextView? = itemView.findViewById(R.id.txtTitle)
    }
}

