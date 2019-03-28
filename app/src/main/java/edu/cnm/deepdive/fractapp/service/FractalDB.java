package edu.cnm.deepdive.fractapp.service;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;
import edu.cnm.deepdive.fractapp.model.dao.FractalTypeDao;
import edu.cnm.deepdive.fractapp.model.entity.Fractal;
import edu.cnm.deepdive.fractapp.service.FractalDB.Converters;
import java.util.Date;

@Database(
    entities = {Fractal.class},
    version = 1,
    exportSchema = true
)
@TypeConverters(Converters.class)
public abstract class FractalDB extends RoomDatabase {

  private static final String DB_NAME = "fractal_db";

  private static FractalDB instance = null;

  public synchronized static FractalDB getInstance(Context context) {
    if (instance == null) {
      instance = Room.databaseBuilder(context.getApplicationContext(), FractalDB.class, DB_NAME)
          .build();
    }
    return instance;
  }

  public synchronized static void forgetInstance() {
    instance = null;
  }

  public abstract FractalTypeDao getFractalTypeDao();

  public static class Converters {

    @TypeConverter
    public static Date dateFromLong(Long time) {
      return (time != null) ? new Date(time) : null;
    }

    @TypeConverter
    public static Long longFromDate(Date date) {
      return (date != null) ? date.getTime() : null;
    }

  }

}

