package com.google.android.exoplayer2;

public class MoinSingelton {
  private static MoinSingelton single_instance = null;
  public boolean errorOccured;


  private MoinSingelton()
  {
    errorOccured = false;
  }

  // static method to create instance of Singleton class
  public static MoinSingelton getInstance()
  {
    if (single_instance == null)
      single_instance = new MoinSingelton();

    return single_instance;
  }

}
