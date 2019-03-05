package edu.cnm.deepdive.fractapp.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class User {
  @PrimaryKey
  private final int userId;
  private String name;
  @ColumnInfo(name = "user_name")
  private String UserName;

  public User(int userId) {
    this.userId = userId;
  }
  public String getUserName() {
    return UserName;
  }
  public void setUserName(String UserName) {
    this.UserName = UserName;
  }
}
