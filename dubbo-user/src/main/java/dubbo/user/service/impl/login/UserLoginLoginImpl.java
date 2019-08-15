package dubbo.user.service.impl.login;

import dubbo.service.api.UserLoginService;
import dubbo.service.req.UserReqDto;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;

@Service
public class UserLoginLoginImpl implements UserLoginService {
    public String login(UserReqDto userReqDto) {
        RpcContext context = RpcContext.getContext();

        System.out.println(context.get());
        System.out.println("attache->"+context.getAttachments());

        System.out.println(context.get());
        return "haah";
    }
}
