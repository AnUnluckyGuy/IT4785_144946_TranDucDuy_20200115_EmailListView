package com.example.emaillistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items:ArrayList<Email> = arrayListOf(
            Email("DaZ", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
            Email("SomeoneUdonotknow", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
            Email("grizie", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
            Email("Luffy", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
            Email("TheGreatGasby", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
            Email("Nobody", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
            Email("Hackerlord", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
            Email("faker", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
            Email("yourBestfriendGF", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
            Email("DaZ", "This is a test email","Just want to know if you still OK and all I want to say is that I really miss you, miss the love of my life?"),
        );
        val adapter = ListViewAdapter(this, items);
        val listVIew: ListView = findViewById(R.id.email_listview);
        listVIew.adapter = adapter;
    }
}