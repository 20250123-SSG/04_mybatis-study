package com.johnth.section03.service;

import com.johnth.section03.dao.MenuMapper;
import com.johnth.section03.dto.CategoryDto;
import com.johnth.section03.dto.MenuDto;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.johnth.section03.common.Template.getSqlSession;

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
        MenuDto menuDto = menuMapper.selectMenuByMenuCode(code);
        sqlSession.close();
        return menuDto;
    }

    public List<MenuDto> selectMenuListByCategoryCode(int code) {
        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);
        List<MenuDto> list = menuMapper.selectMenuByCategoryCode(code);
        sqlSession.close();
        return list;
    }
    /* 이전 방식
    public int registMenu(MenuDto menu) {
        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);
        int result = menuMapper.insertMenu(menu);
        if (result > 0) {
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result;
    }
     */

    public int registMenu(MenuDto menu) {
        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);
        int result = 0;
        try{
            result = menuMapper.insertMenu(menu);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            sqlSession.close();
        }

        return result;
    }

    public int modifyMenu(MenuDto menu) {
        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);
        int result = 0;
        try{
            result = menuMapper.updateMenu(menu);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            sqlSession.close();
        }

        return result;
    }

    public int removeMenu(int code) {
        SqlSession sqlSession = getSqlSession();
        menuMapper = sqlSession.getMapper(MenuMapper.class);
        int result = 0;
        try{
            result = menuMapper.deleteMenu(code);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            sqlSession.close();
        }
        return result;
    }
}
