package com.example.todoapp.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.todoapp.Table.Date;


@Dao
public interface DateDao {
    @Query("SELECT * FROM date_table ORDER BY date_id LIMIT 1")
    Date getDate();

    @Insert
    void insertDate(Date date);

    @Update
    void updateDate(Date date);
}
