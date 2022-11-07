package com.codegym.book.logger;

import com.codegym.book.utils.ReadAndWriteFile;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Component
@Aspect
public class LogAspect {
    private final String PATH = "/Users/tuhungle/Desktop/WorkSpace/A0222I2-LeTuHung/Module4/ss9_aop/bai_tap/book/src/main/resources/file-log/log.csv";
    @Pointcut("execution(* com.codegym.book.controller.BookController.*(..))")
    public void allMethodPointCut() {
    }

    @After("allMethodPointCut()")
    public void afterCallMethod(JoinPoint joinPoint) {
        String mess = "METHOD NAME: " + joinPoint.getSignature().getName() + " TIME: " + LocalDateTime.now();
        List<String> stringList = new ArrayList<>();
        stringList.add(mess);
        ReadAndWriteFile.writeListStringToCSV(PATH,stringList);
    }
}
