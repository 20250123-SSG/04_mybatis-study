package com.podoseee.section03.controller;

import com.podoseee.section03.dto.CategoryDto;
import com.podoseee.section03.dto.MenuDto;
import com.podoseee.section03.service.MenuService;
import com.podoseee.section03.view.ResultView;

import java.util.List;

public class MenuController {

    private MenuService menuService = new MenuService();

    public void selectMenuList(){
        List<MenuDto> list = menuService.selectMenuList();
        ResultView.displayMenuList(list);
    }

    public void selectSubCategoryList() {
        List<CategoryDto> list = menuService.selectSubCategoryList();
        ResultView.displayCategoryList(list);
    }

    public void selectMenuByMenuCode(String code) {
        MenuDto menu = menuService.selectMenuByMenuCode(Integer.parseInt(code));
        ResultView.displayMenu(menu);
    }

    public void selectMenuListByCategory(String code) {
        List<MenuDto> list = menuService.selectMenuListByCategoryCode(Integer.parseInt(code));
        ResultView.displayMenuList(list);

    }

    public void registMenu(boolean b, boolean b1) {
    }
}
