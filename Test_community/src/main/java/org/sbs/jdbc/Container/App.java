package org.sbs.jdbc.Container;

public class App {

  public void run() {
    Scanner sc = Container.scanner;

    while (true) {
      System.out.printf("명령어) ");
      String cmd = sc.nextLine();

      if(cmd.euals("/usr/article/list")) {
        System.out.println("== 게시물 리스트 ==");
      }
      else if(cmd.equals("exit")) {
        System.out.println("프로그램 종료");
        break;
      }
    }

    sc.close();
  }
}
