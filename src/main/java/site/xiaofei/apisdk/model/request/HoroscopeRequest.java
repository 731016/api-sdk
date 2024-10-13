package site.xiaofei.apisdk.model.request;

import site.xiaofei.apisdk.model.enums.RequestMethodEnum;
import site.xiaofei.apisdk.model.params.HoroscopeParams;
import site.xiaofei.apisdk.model.request.common.BaseRequest;
import site.xiaofei.apisdk.model.response.common.ResultResponse;
import lombok.experimental.Accessors;

@Accessors(chain = true)
public class HoroscopeRequest extends BaseRequest<HoroscopeParams, ResultResponse> {

	@Override
	public String getPath() {
		return "/api/interface/horoscope";
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
