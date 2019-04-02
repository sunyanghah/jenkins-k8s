package sy.demo.test.jenkinsk8s.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import sy.demo.test.jenkinsk8s.platform.RP;

/**
 * Created by dell on 2019/3/11.
 * @author dell
 */
@RestController
@Slf4j
public class TestController {

    @GetMapping("/test")
    public RP test() throws Exception{
        log.info("---------------------test--test---test----------------------------");
        return RP.buildSuccess("this is message 2222222222222222","this is data 2222222222222222222");
    }

    @PutMapping("/test/{id}")
    public RP test(@PathVariable("id")Long id) throws Exception{
        log.info("-------------------{}--------",id);
        return RP.buildSuccess("dsf");
    }

    public static void main(String[] args) throws Exception{
        byte b = '2';
        System.out.println(b);
        System.out.println('9'+1);
        byte b2 = new Byte("127");
        System.out.println(b2++);
        System.out.println(++b2);
    }
}
