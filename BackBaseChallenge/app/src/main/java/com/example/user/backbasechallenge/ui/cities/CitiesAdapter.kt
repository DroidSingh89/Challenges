package com.example.user.backbasechallenge.ui.cities

import android.annotation.SuppressLint
import android.content.ComponentName
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.user.backbasechallenge.R
import com.example.user.backbasechallenge.ui.about.AboutActivity
import com.example.user.backbasechallenge.ui.map.MapsActivity

class CitiesAdapter(val citiesList: MutableList<City>) : RecyclerView.Adapter<CitiesAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_city, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return citiesList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val city = citiesList[position]

        holder.tvName.text = "${city.name}, ${city.country}"
        holder.tvCoord.text = "${city.coord.lat}, ${city.coord.lon}"

    }

    fun updateList(citiesList: List<City>) {
        this.citiesList.clear()
        this.citiesList.addAll(citiesList)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        override fun onClick(v: View?) {
            when (v?.id) {
                R.id.btnAbout ->
                    itemView.context.startActivity(Intent().apply {
                        component = ComponentName(itemView.context, AboutActivity::class.java)
                    })

                else ->
                    itemView.context.startActivity(Intent().apply {
                        component = ComponentName(itemView.context, MapsActivity::class.java)
                        putExtra("city", citiesList[adapterPosition])
                    })
            }
        }

        val tvName = itemView.findViewById<TextView>(R.id.tvName)
        val tvCoord = itemView.findViewById<TextView>(R.id.tvCoord)
        val btnAbout = itemView.findViewById<Button>(R.id.btnAbout)

        init {
            btnAbout.setOnClickListener(this)
            itemView.setOnClickListener(this)
        }

    }
}