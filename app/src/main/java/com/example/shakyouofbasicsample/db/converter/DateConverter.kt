package com.example.shakyouofbasicsample.db.converter

import androidx.room.TypeConverter
import java.util.Date

class DateConverter {

    companion object {

        @TypeConverter
        open fun toDate(timestamp: Long?): Date? {
            return timestamp?.let {
                Date(it)
            }
        }

        @TypeConverter
        open fun toTimestamp(date: Date?): Long? {
            return date?.time
        }

    }

}