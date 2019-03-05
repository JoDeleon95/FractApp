package edu.cnm.deepdive.fractapp.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(
    foreignKeys = {
        @ForeignKey(
            entity = FractalType.class,
            parentColumns = "fractal_type_id", childColumns = "fractal_type_id",
            onDelete = ForeignKey.CASCADE
        ),
        @ForeignKey(entity = User.class,
            parentColumns = "user_id", childColumns = "user_id",
            onDelete = ForeignKey.CASCADE
        )
    }
)


public class Snapshot {

  @ColumnInfo(name = "fractal_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  private int currentValue;
  private int scale;
  private int colorScheme;
  private int timestamp;

  @ColumnInfo(name = "user_id", index = true)
  private int userId;

  @ColumnInfo(name = "fractal_type_id", index = true)
  private int fractalTypeId;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getCurrentValue() {
    return currentValue;
  }

  public void setCurrentValue(int currentValue) {
    this.currentValue = currentValue;
  }

  public int getScale() {
    return scale;
  }

  public void setScale(int scale) {
    this.scale = scale;
  }

  public int getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(int colorScheme) {
    this.colorScheme = colorScheme;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(int timestamp) {
    this.timestamp = timestamp;
  }

  public int getFractalTypeId() {
    return fractalTypeId;
  }

  public void setFractalTypeId(int fractalTypeId) {
    this.fractalTypeId = fractalTypeId;
  }
}
