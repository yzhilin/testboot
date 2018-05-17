package hello;

import dto.Person;

import java.util.Optional;

/**
 * @author yangzhilin
 * @date 2018/5/2
 * @description
 */
public class TestMain {
    public static void main(String[] args) {
//        Optional<String>optional=Optional.of("dd")
//                .map(String::toUpperCase);
//        System.out.println(optional.get());
//        Optional<String>optional=Optional.of("dd")
//                .flatMap(value->Optional.ofNullable(value));
//        System.out.println(optional.get());


        Person person = new Person();
        Double a=null;
        person.setSalary(a);
        System.out.println(person);
    }


}
