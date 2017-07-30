package cloud.simple.hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
 
@Controller
@SpringBootApplication
public class SampleController  {
 
    @ResponseBody
    @RequestMapping(value = "/")
    String home() { 
    	try
    	{
    		testRedis.testObj();
    	}
    	catch(Exception e)
    	{
    		
    	}
        return "Hello World!";
    }
 
    @Autowired
    public TestRedis testRedis;
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);

    }
 
}