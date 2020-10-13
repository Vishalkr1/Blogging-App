package com.example.bloggingapp.Room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "posts_table")
public class Posts implements Serializable {
    @PrimaryKey(autoGenerate = true)
    int id;
    @ColumnInfo(name = "post_title")
    String postTitle;
    @ColumnInfo(name = "description")
    String description;

    public int getId() {
        return id;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

