import dto.Person;
import sun.awt.image.InputStreamImageSource;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author yangzhilin
 * @date 2018/5/7
 * @description
 */
public class Test {
    public static void main(String[] args) {
        try(InputStream fis = new FileInputStream("")){
            throw new RuntimeException();
        }catch (Exception e){
            System.out.println("catch==========");
        }



    }
}
