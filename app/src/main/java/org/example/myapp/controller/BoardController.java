package org.example.myapp.controller;

import org.example.myapp.domain.Board;
import org.example.myapp.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

  private final BoardService boardService;

  public BoardController(BoardService boardService) {
    this.boardService = boardService;
  }

  @GetMapping("/form")
  public void form() {
    // 메서드의 리턴 값이 없으면 요청 URL이 템플릿 파일의 경로로 사용된다.
    // 즉 '/board/form' URL의 템플릿 파일 경로는 'templates/board/form.html' 이다.
  }

  @PostMapping("/add")
  public String add(@ModelAttribute Board board) {
    boardService.addBoard(board);
    return "redirect:/board/list"; // 저장 후 게시글 목록 페이지로 리다이렉트
  }
}
