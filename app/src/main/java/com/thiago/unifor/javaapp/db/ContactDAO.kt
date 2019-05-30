package com.thiago.unifor.javaapp.db

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Update

import com.thiago.unifor.javaapp.db.entity.Contact

@Dao
interface ContactDAO {

    @get:Query("select * from contacts")
    val contacts: List<Contact>

    @Insert
    fun addContact(contact: Contact): Long

    @Update
    fun updateContact(contact: Contact)

    @Delete
    fun deleteContact(contact: Contact)

    @Query("select * from contacts where contact_id ==:contactId")
    fun getContact(contactId: Long): Contact


}
