package site.xiaofei.apisdk.config;

import site.xiaofei.apisdk.client.ApiClient;
import site.xiaofei.apisdk.service.ApiService;
import site.xiaofei.apisdk.service.impi.ApiServiceImpl;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@EnableConfigurationProperties(ApiClient.class)
public class ApiClientAutoConfig {

	@Bean
	public ApiService apiService() {
		return new ApiServiceImpl();
	}

}
