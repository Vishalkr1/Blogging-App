package com.example.bloggingapp.Room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PostsDAO {

    @Query("SELECT * FROM posts_table")
    LiveData<List<Posts>> getAllPosts();

    @Insert
    void insert(List<Posts> postsList);
}
