package com.example.contact_list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contact_list.databinding.ActivityMainBinding

class contactRvAdapter(var contactList: List<contactData>):RecyclerView.Adapter<contactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactViewHolder {
        var binding=ContactMainListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return contactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: contactViewHolder, position: Int) {
        var contacts=contactList[position]
        holder.binding.apply{
            tvName.text=contacts.name
            tvEmail.text=contacts.email
            tvAge.text=contacts.age.toString()
            tvPhoneNumber.text=contacts.phoneNumber
        }
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

}
class contactViewHolder(var binding: ActivityMainBinding):RecyclerView.ViewHolder(binding.root){

}