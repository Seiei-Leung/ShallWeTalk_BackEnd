package top.seiei.shallwetalk;

import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;
import top.seiei.shallwetalk.service.AccountService;

import java.util.logging.Logger;

/**
 * Jersey 框架初始化配置(如同 Spring MVC 中的 dispatcher-serlvet.xml)
 * 需要继承 ResourceConfig
 * 创建构造函数
 * 注册路由逻辑处理
 * 注册 JSON 解析器
 * 注册日志工具
 */
public class Application extends ResourceConfig {

    // 创建构造函数
    public Application(){

        // 注册路由逻辑处理
        // 使用 packages 传入逻辑处理的包名即可，如
        // packages("top.seiei.shallwetalk.service");
        // 这里使用了反射的形式获取逻辑处理包名
        packages(AccountService.class.getPackage().getName());

        // 注册 Json 解释器
        register(JacksonJsonProvider.class);

        // 注册日志
        register(Logger.class);

    }

}
