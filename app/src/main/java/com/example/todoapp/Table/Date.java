package com.example.todoapp.Table;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "date_table")
public class Date {
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name="date_id")
    private int date_id;

    @ColumnInfo(name="date_start")
    private Date date_start;

}
