package com.podoseee.section03.view;

import com.podoseee.section03.controller.MenuController;
import com.podoseee.section03.dto.MenuDto;

import java.util.Map;
import java.util.Scanner;

public class MenuView {

    private MenuController menuController = new MenuController();
    private Scanner sc = new Scanner(System.in);

    public void mainMenuView(){
        while(true){
            System.out.print("""
                    \n==================================
                    1. 전체 메뉴 목록 조회
                    2. 메뉴 코드로 메뉴 조회
                    3. 카테고리 코드로 메뉴 목록 조회
                    4. 하위 카테고리 목록 조회
                    5. 신규 메뉴 등록
                    6. 기존 메뉴 수정
                    7. 기존 메뉴 삭제
                    0. 프로그램 종료
                    ===================================
                    > 입력:""");

            String menu = sc.nextLine();
            switch(menu){
                case "1": menuController.selectMenuList(); break;
                case "2": menuController.selectMenuByMenuCode(inputCode("메뉴코드")); break;
                case "3": menuController.selectMenuListByCategory(inputCode("카테고리코드")); break;
                case "4": menuController.selectSubCategoryList(); break;
                case "5": registMenuForm();break;
                case "6": break;
                case "7": break;
                case "0": return;
                default :
                    System.out.println("메뉴를 잘못 입력하셨습니다.");
            }
        }
    }

    // 코드 입력받는 서브 화면
    public String inputCode(String type){ // type:"메뉴코드"|"카테고리코드"
        System.out.printf("> %s 입력: ", type);
        return sc.nextLine();
    }

    // 신규 메뉴 등록용 폼 제공 화면
    private void registMenuForm() {
        System.out.println("\n~~~~ 등록할 메뉴 정보를 작성해주세요 ~~~~");
        System.out.println("> 메뉴명: ");
        String menuName = sc.nextLine();
        System.out.println("> 메뉴가격: ");
        String menuPrice = sc.nextLine();
        System.out.println("> 카테고리코드: ");
        menuController.selectSubCategoryList(); // 카테고리 목록 출력해주기
        String categoryCode = sc.nextLine();
        System.out.println("> 주문가능여부(Y/N): ");
        String orderableStatus = sc.nextLine().toUpperCase();

        Map<String, String> requestParam = Map.of(
                "name", menuName,
                "price", menuPrice,
                "category", categoryCode,
                "orderable", orderableStatus
        );

        menuController.registMenu(Map<String, String> requestParam){
            // 요청시 전달된 데이터 => MenuDto 옮기기
            MenuDto menu = MenuDto.builder()
                    .menuName(requestParam.get("name"))
                    .menuPrice(Integer.parseInt(requestParam.get("price"))
                    .categoryCode(Integer.parseInt(requestParam.get("category"))
                    .orderableStatus(requestParam.get("orderable"))
                    .build();

            int result = menuService.registMenu(menu);
        }
    }


}
