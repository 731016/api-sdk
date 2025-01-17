package site.xiaofei.apisdk.model.request.common;

import site.xiaofei.apisdk.model.response.common.ResultResponse;
import lombok.experimental.Accessors;

@Accessors(chain = true)
public class CurrencyRequest extends BaseRequest<Object, ResultResponse> {

	private String method;

	private String path;

	@Override
	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	/**
	 * 获取路径
	 */
	@Override
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * 获取响应类
	 */
	@Override
	public Class<ResultResponse> getResponseClass() {
		return ResultResponse.class;
	}

}
