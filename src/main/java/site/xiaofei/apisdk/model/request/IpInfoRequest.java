package site.xiaofei.apisdk.model.request;

import site.xiaofei.apisdk.model.enums.RequestMethodEnum;
import site.xiaofei.apisdk.model.params.IpInfoParams;
import site.xiaofei.apisdk.model.request.common.BaseRequest;
import site.xiaofei.apisdk.model.response.common.ResultResponse;
import lombok.experimental.Accessors;

@Accessors(chain = true)
public class IpInfoRequest extends BaseRequest<IpInfoParams, ResultResponse> {

	@Override
	public String getPath() {
		return "/api/interface/ipInfo";
	}

	/**
	 * 获取响应类
	 */
	@Override
	public Class<ResultResponse> getResponseClass() {
		return ResultResponse.class;
	}

	@Override
	public String getMethod() {
		return RequestMethodEnum.GET.getValue();
	}

}
