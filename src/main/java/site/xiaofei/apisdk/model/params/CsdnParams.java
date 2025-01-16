package site.xiaofei.apisdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author tuaofei
 * @description TODO
 * @date 2025/1/15
 */
@Data
@Accessors(chain = true)
public class CsdnParams implements Serializable {

    /**
     * 用户id
     */
    private String userId;
}
