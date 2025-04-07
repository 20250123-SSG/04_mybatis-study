package com.johnth.section03.view;

import com.johnth.section03.dto.CategoryDto;
import com.johnth.section03.dto.MenuDto;

import java.util.List;

public class ResultView {

    public static void displayMenuList(List<MenuDto> list){
        if(list.isEmpty()){
            System.out.println("조회된 결과 없음");
        } else {
            for(MenuDto menuDto : list){
                System.out.printf("%d\t%s\t%d원\t%d\t%s\n",
                        menuDto.getMenuCode(),
                        menuDto.getMenuName(),
                        menuDto.getMenuPrice(),
                        menuDto.getCategoryCode(),
                        menuDto.getOrderableStatus());
            }
        }
    }

    public static void displayCategoryList(List<CategoryDto> list){
        for(CategoryDto categoryDto : list){
            System.out.printf("%d. %s ", categoryDto.getCategoryCode(), categoryDto.getCategoryName());
        }
        System.out.println();
    }

    public static void displayMenu(MenuDto menuDto){
        if(menuDto == null){
            System.out.println("조회된 결과 없음");
        } else {
            System.out.println("메뉴정보");
            System.out.println("Code: " + menuDto.getCategoryCode());
            System.out.println("Name: " + menuDto.getMenuName());
            System.out.println("Price: " + menuDto.getMenuPrice());
            System.out.println("Category: " + menuDto.getCategoryCode());
            System.out.println("Status: " + ("Y".equals(menuDto.getOrderableStatus())? "주문가능" : "주문불가"));
        }
    }

    public static void displayResult(String type, int result){
        System.out.println("Result type: " + type + " " + (result > 0 ? "성공" : "실패"));
    }
}
