package com.example.firstappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.btnRegister).setOnClickListener {
            validate()
        }
    }

    fun validate(){
        if(findViewById<EditText>(R.id.edtAddress).text.isEmpty()){
            Toast.makeText(this,"Empty address", Toast.LENGTH_SHORT)
            return
        }
        if(findViewById<EditText>(R.id.edtBirthday).text.isEmpty()){
            Toast.makeText(this,"Empty birthday", Toast.LENGTH_SHORT)
            return
        }
        if(findViewById<EditText>(R.id.edtEmail).text.isEmpty()){
            Toast.makeText(this,"Empty email", Toast.LENGTH_SHORT)
            return
        }
        if(findViewById<EditText>(R.id.edtFirstname).text.isEmpty()){
            Toast.makeText(this,"Empty firstname", Toast.LENGTH_SHORT)
            return
        }
        if(findViewById<EditText>(R.id.edtLastname).text.isEmpty()){
            Toast.makeText(this,"Empty lastname", Toast.LENGTH_SHORT)
            return
        }
        if(!findViewById<CheckBox>(R.id.cbTerm).isChecked){
            Toast.makeText(this,"Please confirm you agree with the term", Toast.LENGTH_SHORT)
            return
        }
        if(!findViewById<CheckBox>(R.id.rdFemale).isChecked && !findViewById<CheckBox>(R.id.rdMale).isChecked){
            Toast.makeText(this,"Please choose your gender", Toast.LENGTH_SHORT)
            return
        }
    }
}