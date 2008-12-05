package edu.okstate.cs.des;

public class Sbox7 extends Sbox {
  private static  int sb[][]={
      {4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1},
      {13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6},
      {1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6 ,8, 0, 5, 9, 2},
      {6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12}
  };
  
  public static String call(String string) {
    //Create a substring of 6bits
    String substring = string.substring(25,40);
    
    return sbox(string, sb);
  }
}