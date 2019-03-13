package sy.demo.test.jenkinsk8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by dell on 2018/11/22.
 * @author dell
 */
@SpringBootApplication(scanBasePackages = {"sy.demo.test"})
public class Jenkinsk8sApplication {
    public static void main(String[] args){
        SpringApplication.run(Jenkinsk8sApplication.class,args);
    }
}
