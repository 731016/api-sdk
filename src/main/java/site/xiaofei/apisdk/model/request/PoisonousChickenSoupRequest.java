package site.xiaofei.apisdk.model.request;

import site.xiaofei.apisdk.model.enums.RequestMethodEnum;
import site.xiaofei.apisdk.model.params.PoisonousChickenSoupParams;
import site.xiaofei.apisdk.model.request.common.BaseRequest;
import site.xiaofei.apisdk.model.response.PoisonousChickenSoupResponse;
import lombok.experimental.Accessors;

@Accessors(chain = true)
public class PoisonousChickenSoupRequest extends BaseRequest<PoisonousChickenSoupParams, PoisonousChickenSoupResponse> {

	@Override
	public String getPath() {
		return "/api/interface/poisonousChickenSoup";
	}

	/**
	 * 获取响应类
	 */
	@Override
	public Class<PoisonousChickenSoupResponse> getResponseClass() {
		return PoisonousChickenSoupResponse.class;
	}

	@Override
	public String getMethod() {
		return RequestMethodEnum.GET.getValue();
	}

}
