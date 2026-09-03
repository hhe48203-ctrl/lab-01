package com.example.petshop

class SadMood(date: String) : Mood(date) {
    override fun describe(): String {
        return "Sad on $date"
    }
}