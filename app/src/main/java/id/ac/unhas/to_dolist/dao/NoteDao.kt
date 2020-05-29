package id.ac.unhas.to_dolist.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import id.ac.unhas.to_dolist.entity.Note


//interface Dao for Note table sql operations
@Dao
interface NoteDao {

    @Insert
    fun insert(note: Note)

    @Update
    fun update(note: Note)

    @Delete
    fun delete(note: Note)

    @Query("select * from tbl_note")
    fun getAllNotes():LiveData<List<Note>>
}