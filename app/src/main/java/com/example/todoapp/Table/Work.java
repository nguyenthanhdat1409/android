package com.example.todoapp.Table;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "work_table")
public class Work {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="work_id")
    private int work_id;

    @ColumnInfo(name="work_title")
    private String work_title;

    @ColumnInfo(name="work_note ")
    private String work_note;

    @ColumnInfo(name="work_deadline")
    private Date work_deadline;

    @ColumnInfo(name="work_type")
    private String work_type;

    @ColumnInfo(name="work_status")
    private int work_status;

    @ColumnInfo(name="work_uid")
    private int work_uid;
}
