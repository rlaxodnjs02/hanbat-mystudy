package org.example.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

  @GetMapping("/form")
  public void form() {
    // 메서드의 리턴 값이 없으면 요청 URL이 템플릿 파일의 경로로 사용된다.
    // 즉 '/board/form' URL의 템플릿 파일 경로는 'templates/board/form.html' 이다.
  }
}
