package org.example.myapp;

import org.example.myapp.domain.Board;

public class test {
  public static void main(String[] args) {
    Board b = new Board();
    int a = 100;
    Integer obj = Integer.valueOf(100);

    Integer obj2 = a; // Integer.valueOf(a); auto-boxing
    int a2 = obj; // obj.intValue(); auto-unboxing
  }
}
