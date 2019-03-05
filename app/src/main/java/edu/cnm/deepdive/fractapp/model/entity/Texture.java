package edu.cnm.deepdive.fractapp.model.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Texture {

  @ColumnInfo(name = "texture_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  private String Name;
  private int TextureType;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public int getTextureType() {
    return TextureType;
  }

  public void setTextureType(int textureType) {
    TextureType = textureType;
  }
}
