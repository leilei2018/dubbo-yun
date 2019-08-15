package dubbo.service.req;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserReqDto implements Serializable {

    private String userId;
    private String userCode;
    private String userName;
}
