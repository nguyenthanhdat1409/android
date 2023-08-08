package com.example.todoapp.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.todoapp.Table.Work;

import java.util.List;

@Dao
public interface WorkDao {
    @Query("SELECT * FROM work_table")
    List<Work> getAllWorks();

    @Insert
    void insertWork(Work work);

    @Update
    void updateWork(Work work);

    @Delete
    void deleteWork(Work work);
}
