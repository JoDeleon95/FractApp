package edu.cnm.deepdive.fractapp;

import android.app.Application;
/**
 * This class contains a static method that creates an instance for
 * FractApplication
 *
 */
public class FractApplication extends Application {

  private static FractApplication instance = null;

  @Override
  public void onCreate() {
    super.onCreate();
    instance = this;
  }


  public static FractApplication getInstance() {
    return instance;
  }
}

