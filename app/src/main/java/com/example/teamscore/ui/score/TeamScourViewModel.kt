package com.example.teamscore.ui.score

import android.widget.Toast
import androidx.lifecycle.ViewModel

class TeamScourViewModel: ViewModel() {
    private var _scoure = 100.0
    val score: Double get() = _scoure
    private var _action = ""
    val action: String get() = _action

    fun addOnePoint(){
        if (_scoure < 100.0) {
            _scoure += 1
            _action = "You're add one point"
        } else {
            //Toast.makeText(this, "You can not add", Toast.LENGTH_LONG)
        }
    }
    fun subTwoPoint(){
        if (_scoure != 0.0) {
            _scoure -= 2
            _action = "You're subtract two point"
        } else {
            //Toast.makeText(this, "You can subtract subs", Toast.LENGTH_LONG)
        }
    }
    fun addFourPoint(){
        if (_scoure < 98.00) {
            _scoure += 4
            _action = "You're add four point"
        } else {
            //Toast.makeText(this, "You can not add", Toast.LENGTH_LONG)
        }
    }
}