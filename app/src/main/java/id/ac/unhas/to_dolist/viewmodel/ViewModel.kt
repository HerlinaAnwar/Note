package id.ac.unhas.to_dolist.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import id.ac.unhas.to_dolist.entity.Note
import id.ac.unhas.to_dolist.repository.Repository

class ViewModel(app:Application):AndroidViewModel(app) {

    var repository:Repository = Repository(app)

    //Database Operations in view model

    fun insert(note: Note){
        repository.insert(note)
    }

    fun delete(note: Note){
        repository.delete(note)
    }

    fun update(note: Note){
        repository.update(note)
    }

    fun getAllNotes():LiveData<List<Note>>{
        return repository.getAllNotes()
    }
}