package com.cc.txlcn;

import java.sql.Connection;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codingapi.txlcn.tc.aspect.weave.DTXResourceWeaver;


@Component
@Aspect
public class TomcatDataSourceAspect {

    @Autowired
    private DTXResourceWeaver dtxResourceWeaver;

    @Around("execution(public java.sql.Connection org.apache.tomcat.jdbc.pool.DataSourceProxy.getConnection(..) )")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        return dtxResourceWeaver.getConnection(() -> (Connection) point.proceed());
    }

}
