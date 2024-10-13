package site.xiaofei.apisdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import site.xiaofei.apisdk.model.response.common.ResultResponse;

@Data
@EqualsAndHashCode(callSuper = true)
public class PoisonousChickenSoupResponse extends ResultResponse {

	private String text;

}
