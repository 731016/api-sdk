RPC：远程过程调用，🚀简化调用

# 快速开始

## 👌 新手需知

拥有 Java 开发环境以及相应 IDE
熟悉 Spring Boot
熟悉 Maven

## 📦 安 装
提示 🔔️
**JDK 8 +**

### ⚙️ 配置客户端

#### 1. 前往[API 接口服务平台](http://xiaofei.site:19001/account/center) 获取开发者密钥对

#### 2. 初始化客户端 ApiClient 对象

- 方法 1 ：主动实例化客户端

  ```java
  String accessKey = "Your AccessKey";
  String secretKey = "Your SecretKey";
  ApiClient client = new ApiClient(accessKey, secretKey);
  ```

- 方法 2 ：通过配置文件注入对象

  - yml

    ```yml
    # API 配置
    api:
      client:
        access-key: Your AccessKey
        secret-key: Your SecretKey
    ```

  - properties

    ```properties
    api.client.access-key=Your AccessKey
    api.client.secret-key=Your SecretKey
    ```

#### 3. 使用 API 服务

```java
 @Resource
 private ApiService apiService;
```

#### 4. 发起请求示例

示例：幽默段子

- 示例一 ：**通过配置文件 推荐 👍**

```java
try {
    PoisonousChickenSoupResponse poisonousChickenSoup = apiService.getPoisonousChickenSoup();
    System.out.println("poisonousChickenSoup = " + poisonousChickenSoup);
} catch (ApiException e) {
  log.error(e.getMessage());
}
```

- 示例二 ：主动注入

```java
try {
    ApiClient ApiClient = new ApiClient("Your AccessKey", "Your SecretKey");
    PoisonousChickenSoupResponse poisonousChickenSoup = apiService.getPoisonousChickenSoup(ApiClient);
    System.out.println("poisonousChickenSoup = " + poisonousChickenSoup);
} catch (ApiException e) {
    log.error(e.getMessage());
}
```

响应：

```json
{
  "text": "不知道你混什么圈，反正我的是混黑眼圈。"
}
```
