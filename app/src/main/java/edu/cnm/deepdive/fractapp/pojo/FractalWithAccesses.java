package edu.cnm.deepdive.fractapp.pojo;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;
import edu.cnm.deepdive.fractapp.model.entity.Access;
import edu.cnm.deepdive.fractapp.model.entity.Fractal;
import java.util.List;

public class FractalWithAccesses {

  @Embedded
  private Fractal fractal;

  @Relation(parentColumn = "fractal_id", entityColumn = "fractal_id")
  private List<Access> accesses;

  public Fractal getFractal() {
    return fractal;
  }

  public void setFractal(Fractal fractal) {
    this.fractal = fractal;
  }

  public List<Access> getAccesses() {
    return accesses;
  }

  public void setAccesses(List<Access> accesses) {
    this.accesses = accesses;
  }
}
