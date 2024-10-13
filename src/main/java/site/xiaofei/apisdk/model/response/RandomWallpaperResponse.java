package site.xiaofei.apisdk.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import site.xiaofei.apisdk.model.response.common.ResultResponse;

@Data
@EqualsAndHashCode(callSuper = true)
public class RandomWallpaperResponse extends ResultResponse {

	private String imgurl;

}
