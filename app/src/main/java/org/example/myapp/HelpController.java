package org.example.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // request handler의 리턴 값은 Thymeleaf가 실행할 view(tamplates 파일) 이름이다
public class HelpController {
  @GetMapping("/help") // "/help" URL 요청을 help.html 템플릿으로 매핑
  public String help() {
    return "help"; // return 값은 클라이언트 에게 보낼 콘텐트가 아님. Thymeleaf 엔진에게 알려줄 템플릿 파일 이름임
  }
}
