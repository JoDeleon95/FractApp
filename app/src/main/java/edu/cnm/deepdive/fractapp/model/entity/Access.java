package edu.cnm.deepdive.fractapp.model.entity;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import java.util.Calendar;

@Entity(
    foreignKeys = @ForeignKey(
        entity = Fractal.class,
        parentColumns = "fractal_id", childColumns = "fractal_id",
        onDelete = ForeignKey.CASCADE
    )
)
public class Access {

  @ColumnInfo(name = "fractal_id")
  @PrimaryKey(autoGenerate = true)
  private long id;

  @ColumnInfo(name = "fractal_id", index = true)
  private long fractalId;

  private Calendar timestamp = Calendar.getInstance();

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getFractalId() {
    return fractalId;
  }

  public void setFractalId(long fractalId) {
    this.fractalId = fractalId;
  }

  public Calendar getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Calendar timestamp) {
    this.timestamp = timestamp;
  }

}
