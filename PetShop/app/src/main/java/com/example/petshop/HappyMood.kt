package com.example.petshop

class HappyMood(date: String) : Mood(date) {
    override fun describe(): String {
        return "Happy on $date"
    }
}