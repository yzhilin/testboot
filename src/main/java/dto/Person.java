package dto;

import java.io.Serializable;

/**
 * @author yangzhilin
 * @date 2018/5/2
 * @description
 */

public class Person implements Serializable {
    public Person() {
    }
    private String userName;
    private double salary;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}
