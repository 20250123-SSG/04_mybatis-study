package com.podoseee;

public class Framework {
     /*
        ## Framework ##
        1. 개발자가 보다 편리한 환경에서 개발할 수 있도록 일련의 클래스 묶음이나
           뼈대, 틀을 제공하는 라이브러리를 구현해 놓은 것
        2. 즉, 공통적으로 사용되는 라이브러리|인터페이스|개발도구 등을 의미
        3. 장점
           1) 개발 시간 단축
              => 효율성 증가
           2) 개발 방법 표준화 (가이드라인 제공)
              => 생산성 향상
              => 높은 품질 보장
              => 유지보수성 증가 및 코드확장 용이
           3) 개발자들을 위한 다양한 도구 지원
        4. 단점
           1) 습득하는데 오랜 시간이 걸림
           2) 개발 방법이 정해져있다 보니 자유롭게, 유연하게 설계 및 코딩하는데 제약 있음
           3) Framework에 의존하다보면 개발 실력 떨어짐
        5. 필요성
           프로젝트 규모 커짐 => 복잡도 높아짐 => 다수의 개발자(스타일 다 다름) 필요
           => 통일성 있게, 빠르고, 안정적으로 개발 => 프레임워크 사용해야됨
        6. 종류
           1) 영속성(Persistence) 프레임워크
                : 데이터의 CRUD를 보다 편리하게 할 수 있도록 기능을 제공
                    ex) MyBatis, Hibernate, JPA 등
           2) 자바 프레임워크
                : 웹 애플리케이션에 초점을 맞춰 필요한 요소들을 모듈화해서 제공
                    ex) Spring, Struts 등
           3) 화면구현 프레임워크
                : Front 작업을 보다 쉽게 구현할 수 있게 제공
                    ex) BootStrap, MDL, Foundation 등
           4) 기능 및 지원 프레임워크
                : 업무 수행에 도움을 줄 수 있는 기능 제공
                    ex) Log4j, JUnit 등

     */

    /*
        ## MyBatis Framework ##
        1. 보다 편리하게 CRUD하기 위해서 xml로 구조화한 Mapper파일을 가지고 JDBC과정을 구현한 영속성 프레임워크
        2. 기존의 JDBC코드의 상당부분을 차지했던 파라미터바인딩(?채우기), 결과매핑(rset값 뽑아 DTO에 담기)를
           xml을 통해 쉽게 구현 가능
        3. 동적 쿼리 기능 지원 (쿼리 작성하는 xml에서 제어문 작성 가능)
     */
}
