package org.example.myapp;

import com.google.common.base.Joiner;
import org.example.util.Utils;

/**
 * 이 클래스는 한밭대학교 특강 실습 예제를 위한 첫 번째 클래스입니다. <br>
 * <code>App</code> 클래스!
 */
public class App {
  /**
   * 애플리케이션의 진입점(entry point) 역할을 하는 메서드입니다. 프로그램을 실행하면 "hello, world"를 콘솔에 출력합니다.
   *
   * @param args 프로그램 실행 시 전달되는 아규먼트 배열
   * @author 한밭대학교
   * @version 1.0
   * @since 2025-07-29
   * @see <a href="https://docs.oracle.com/en/java/javase/21/">JDK Documentation</a>
   */
  public static void main(String[] args) {
    Utils.printMessage("hello, world");
    String message = Joiner.on(", ").join("hello", "world");
    System.out.println(message);
  }
}
