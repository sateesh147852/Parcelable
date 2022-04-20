package com.parcelable.model

import android.os.Parcel
import android.os.Parcelable

class User() : Parcelable {

     var id: Long = 0
     var name: String? = null
     var grade: String? = null

    constructor(parcel: Parcel) : this() {
        id = parcel.readLong()
        name = parcel.readString()
        grade = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeLong(id)
        parcel.writeString(name)
        parcel.writeString(grade)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }

    override fun toString(): String {
        return "id $id name $name grade$grade"
    }
}