package com.thiago.unifor.javaapp.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

import com.thiago.unifor.javaapp.db.entity.Contact

@Database(entities = [Contact::class], version = 1)
abstract class ContactsAppDatabase : RoomDatabase() {

    abstract val contactDAO: ContactDAO


}
