package edu.cnm.deepdive.fractapp.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Fractal {

  @ColumnInfo(name = "fractal_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  private String FractalTypeName;
  private int ColorSchemeId;
  private int TextureId;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFractalTypeName() {
    return FractalTypeName;
  }

  public void setFractalTypeName(String fractalTypeName) {
    FractalTypeName = fractalTypeName;
  }

  public int getColorSchemeId() {
    return ColorSchemeId;
  }

  public void setColorSchemeId(int colorSchemeId) {
    ColorSchemeId = colorSchemeId;
  }

  public int getTextureId() {
    return TextureId;
  }

  public void setTextureId(int textureId) {
    TextureId = textureId;
  }
}
