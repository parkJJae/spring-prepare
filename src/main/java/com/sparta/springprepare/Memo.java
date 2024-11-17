package com.sparta.springprepare;

import lombok.*;

@Getter // lombok이 메서드를 어떻게 만들까
@Setter
//@AllArgsConstructor // 생성자를 만들어줌
//@NoArgsConstructor  // 기본 생성자를 만들어줌 -> ()
@RequiredArgsConstructor // 요구되는 필드들을 가지는 컨스트럭터
public class Memo {
    private final String username; //->  final을 붙이는 이유 ->  RequiredArgsConstructorired
    private String contents;

}

class Main{
    public static void main(String[] args) {
        Memo memo = new Memo("Parkjja"); // Allargsconstructor
       // memo.setUsername("Parkjjae");
        memo.setContents("This is a test");
        System.out.println(memo.getUsername());
        System.out.println(memo.getContents());
    }
}
