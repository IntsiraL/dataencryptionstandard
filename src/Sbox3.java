package edu.okstate.cs.des;

public class Sbox3 extends Sbox {
  private static  int sb[][]={
    {10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8},
    {13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1},
    {13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7},
    {1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12}
  };
  
  public static String call(String string) {
    //Create a substring of 6bits
    String substring = string.substring(12,17);
    
    return sbox(string, sb);
  }
}