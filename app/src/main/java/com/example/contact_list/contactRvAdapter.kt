package com.example.contact_list

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contact_list.databinding.ActivityMainBinding
import com.example.contact_list.databinding.ContactNameListBinding
import com.squareup.picasso.Picasso


class ContactRvAdapter(var contactlist: List<ContactData>) : RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ContactNameListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contact = contactlist.get(position)
        val binding=holder.binding
        binding.imageView3.tag=contact.avatar
        binding.tvName.text=contact.name
        binding.tvEmail.text=contact.email
        binding.tvPhoneNumber.text=contact.number

        binding.btnbutton.setOnClickListener {
            val intent = Intent(holder.itemView.context, MainActivity2::class.java)
            holder.itemView.context.startActivity(intent)
        }

        Picasso
            .get()
            .load(contact.avatar)
            .resize(80,80)
            .into(binding.imageView3)
    }




    override fun getItemCount(): Int {
        return contactlist.size
    }
}
class ContactViewHolder(var binding:ContactNameListBinding) : RecyclerView.ViewHolder(binding.root){

}