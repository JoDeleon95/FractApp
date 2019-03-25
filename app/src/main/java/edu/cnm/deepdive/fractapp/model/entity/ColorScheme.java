package edu.cnm.deepdive.fractapp.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.PrimaryKey;

public class ColorScheme {

  @ColumnInfo(name = "colorScheme_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  private int ColorType;
  private int ColorGradient;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getColorType() {
    return ColorType;
  }

  public void setColorType(int colorType) {
    ColorType = colorType;
  }

  public int getColorGradient() {
    return ColorGradient;
  }

  public void setColorGradient(int colorGradient) {
    ColorGradient = colorGradient;
  }


}
