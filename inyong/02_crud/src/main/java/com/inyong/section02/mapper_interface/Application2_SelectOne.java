package com.kangbroo.section02.mapper_interface;

import com.kangbroo.dto.MenuDto;

import java.util.Scanner;

public class Application2_SelectOne {
    public static void main(String[] args) {
        // 1. 메뉴 번호로 메뉴 검색
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 메뉴번호: ");
        String code = sc.nextLine();

        MenuDto menu = new MenuService().selectMenuByCode( Integer.parseInt(code) );
        System.out.println(menu);

        // 2. 사용자가 입력한 가격 이하의 메뉴의 총개수
        System.out.print("메뉴의 가격: ");
        String price = sc.nextLine();

        int count = new MenuService().selectMenuCountByPrice( Integer.parseInt(price) );
        System.out.println(price + "원 이하의 메뉴의 개수: " + count + "개");
    }
}
