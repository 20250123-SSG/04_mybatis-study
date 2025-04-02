package com.podoseee.section03.service;

import com.podoseee.section03.dao.MenuMapper;
import com.podoseee.section03.dto.CategoryDto;
import com.podoseee.section03.dto.MenuDto;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.podoseee.section03.common.Template.getSqlSession;

public class MenuService {

    private MenuMapper menuMapper;

    public List<MenuDto> selectMenuList() {
        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);
        List<MenuDto> list = menuMapper.selectAllMenu();
        sqlSession.close();
        return list;
    }

    public List<CategoryDto> selectSubCategoryList() {
        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);
        List<CategoryDto> list = menuMapper.selectAllSubCategory();
        sqlSession.close();
        return list;
    }

    public MenuDto selectMenuByMenuCode(int code) {
        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);
        MenuDto menu = menuMapper.selectMenuByMenuCode(code);
        sqlSession.close();
        return menu;
    }

    public List<MenuDto> selectMenuListByCategoryCode(int code) {
        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);
        List<MenuDto> list = menuMapper.selectMenuByCategoryCode(code);
        sqlSession.close();
        return list;
    }

    public int registMenu(MenuDto menu){
        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);
    }
}
