package service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;

/**
 * @author yangzhilin
 * @date 2018/5/3
 * @description
 */

public class MessageService implements Serializable {
    @Value("hello message!!")
    private String Message;

    @PostConstruct
    public void postConstructd(){
        System.out.println("hello world"+Message);
    }
    @PreDestroy
    public void preDestory(){
        System.out.println("destroy============"+Message);
    }




}
