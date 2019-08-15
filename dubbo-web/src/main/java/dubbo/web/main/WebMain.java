package dubbo.web.main;

import dubbo.service.api.UserLoginService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class WebMain {

    @Reference
    UserLoginService userLoginService;

    @PostConstruct
    public void init(){
        RpcContext.getContext().set("aa","aa");

        RpcContext.getContext().setAttachment("bb","bb");
        String login = userLoginService.login(null);
        System.out.println("revei->"+login);
    }

    public static void main(String[] args) {
        SpringApplication.run(WebMain.class,args);
    }

}
