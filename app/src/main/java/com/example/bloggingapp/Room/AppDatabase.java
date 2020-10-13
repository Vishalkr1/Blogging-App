package com.example.bloggingapp.Room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Posts.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase instance;
    public abstract PostsDAO postsDAO();
}
