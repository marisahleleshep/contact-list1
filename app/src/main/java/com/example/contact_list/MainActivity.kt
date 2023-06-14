package com.example.contact_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contact_list.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    override fun onResume(){
        super.onResume()
        displayContact()
    }
    fun displayContact(){
        var contact2=ContactData("https://images.unsplash.com/photo-1587837073080-448bc6a2329b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Chepkemboi","chep@gmail.com","+2541234658905")
        var contact3=ContactData("https://images.unsplash.com/photo-1610611742876-97e4d834d077?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDd8fHxlbnwwfHx8fHw%3D&auto=format&fit=crop&w=500&q=60","Lina","lina@gmail.com","+25489908905")
        var contact4=ContactData("https://images.unsplash.com/photo-1508186225823-0963cf9ab0de?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Katerina","katerina@gmail.com","+254812308905")
        var contact5=ContactData("https://images.unsplash.com/photo-1635578649006-0411a9668946?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=401&q=80","Marisa","marisa@gmail.com","+25489983421")
        var contact6=ContactData("https://images.unsplash.com/photo-1617718860151-f7eb5e599d8e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Tipanoi","tipanoi@gmail.com","+254095608905")
        var contact7=ContactData("https://images.unsplash.com/photo-1617718860151-f7eb5e599d8e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","John","john@gmail.com","+2548678990")


        var contactlist= listOf<ContactData>(contact2,contact3,contact4,contact5,contact6,contact7)
        binding.rvcontacts.layoutManager= LinearLayoutManager(this)
        var contactAdaptor=ContactRvAdapter(contactlist)
        binding.rvcontacts.adapter=contactAdaptor
    }
}