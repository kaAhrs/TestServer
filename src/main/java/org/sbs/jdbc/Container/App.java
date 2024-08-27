package org.sbs.jdbc.Container;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

  List<Article> articles;
  int articleLastId;

  public App() {
    articles = new ArrayList<>();
    articleLastId = 0;
  }

  public void run() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.printf("명령어) ");
      String cmd = scanner.nextLine();

      if (cmd.equals("/usr/article/write")) {
        System.out.println("== 게시물 등록 ==");



        System.out.printf("제목: ");
        String title = scanner.nextLine();

        System.out.printf("내용: ");
        String content = scanner.nextLine();
        int id = ++articleLastId;

        Article article = new Article(id, title, content);
        articles.add(article);

        System.out.printf("%d번 게시물이 작성되었습니다.\n", article.id);

      } else if (cmd.equals("/usr/article/list")) {
        System.out.println("== 게시물 리스트 ==");


        if(articles.isEmpty()) {
          System.out.println("게시물이 존재하지 않습니다.");
          continue;
        }

        System.out.println("번호 / 제목");

/*
        for (Article article : articles) {
          System.out.printf(" %d, %s\n", article.id, article.title);
        }
*/

        for (int i = articles.size() -1; i>=0;i --) {
          Article article = articles.get(i);
          System.out.printf("%d / %s\n", article.id, article.title);
        }

      } else if (cmd.equals("exit")) {
        System.out.println("프로그램 종료");
        break;
      }
    }

    scanner.close();
  }
}
