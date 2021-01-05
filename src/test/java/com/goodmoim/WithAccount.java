package com.goodmoim;

import org.springframework.security.test.context.support.WithSecurityContext;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@WithSecurityContext(factory = WithAccountSecurityContextFactory.class)
public @interface WithAccount { //커스텀 어노테이션을 생성하려면 @interface [어노테이션 명]이라는 형태로 어노테이션을 만들면 된다.
    String value(); //String형 기본 엘리멘트

}