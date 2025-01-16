package site.xiaofei.apisdk.model.request;

import site.xiaofei.apisdk.model.enums.RequestMethodEnum;
import site.xiaofei.apisdk.model.params.CsdnParams;
import site.xiaofei.apisdk.model.request.common.BaseRequest;
import site.xiaofei.apisdk.model.response.common.ResultResponse;

/**
 * @author tuaofei
 * @description TODO
 * @date 2025/1/15
 */
public class CsdnRequest extends BaseRequest<CsdnParams, ResultResponse> {
    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }

    @Override
    public String getPath() {
        return "/api/interface/csdnInfo";
    }

    @Override
    public Class<ResultResponse> getResponseClass() {
        return ResultResponse.class;
    }
}
