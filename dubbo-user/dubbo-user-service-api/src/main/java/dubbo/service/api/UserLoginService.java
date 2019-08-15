package dubbo.service.api;

import dubbo.service.req.UserReqDto;

public interface UserLoginService {
    String login(UserReqDto userReqDto);
}
