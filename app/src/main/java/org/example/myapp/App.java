package org.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
// 스프링 부트를 실행할 수 있도록 기본 정보를 자동 설정
@EnableAutoConfiguration

// 현재 클래스와 같은 패키지 및 하위 패키지를 다 뒤져서 컴포넌트를 찾아 자동으로 생성하라는 설정
// @Component, @Controller, @Service, @Repository 등이 붙은 클래스를 찾음
@ComponentScan
 */

@SpringBootApplication // = @SpringBootConfigration + @EnableAutoConfigration + @ComponentScan
public class App {
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
    System.out.println("스프링부트 서버 시작!");
  }
}
