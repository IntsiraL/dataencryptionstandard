package edu.okstate.cs.des;

public class Sbox8 extends Sbox {
  private static  int sb[][]={
      {13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5 ,0 ,12, 7},
      {1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2},
      {7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8},
      {2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11}
  };
  
  public static String call(String string) {
    //Create a substring of 6bits
    String substring = string.substring(6,12);
    
    return sbox(string, sb);
  }
}