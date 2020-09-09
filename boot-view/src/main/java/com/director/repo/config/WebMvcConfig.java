package com.director.repo.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {



    //     <!--<bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">-->
//        <!--<property name="viewClass" value="org.springframework.web.servlet.view.JstlView"/>-->
//        <!--<property name="prefix" value="/WEB-INF/jsp/"/>-->
//        <!--<property name="suffix" value=".jsp"/>-->
//    <!--</bean>-->

    /**
     * 修改 jsp resolver 的名称这样的话 ，可以加载多种不同的 ViewResolver
     * @return
     */
    @Bean
    public ViewResolver myViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        // ThymeleafViewResolver Ordered.LOWEST_PRECEDENCE - 5
        viewResolver.setOrder(Ordered.LOWEST_PRECEDENCE - 10);
        // 优先级高于 ThymeleafViewResolver
        // 配置 ViewResolver 的 Content-Type
        viewResolver.setContentType("text/xml;charset=UTF-8");
        return viewResolver;
    }

    /**
     * 内容调停的配置
     * @param configurer
     */
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorParameter(true)
                .favorPathExtension(true);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                System.out.println("拦截中...");
                return true;
            }
        });
    }

    /**
     * 解决Idear 本地启动 时， maven 多模块项目 的资源路径 不对的问题（会导致找不到相应的jsp 文件）
     * @return
     */
    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> customizer() {
        return (factory) -> {
            factory.addContextCustomizers((context) -> {
                        String relativePath = "springboot-view/src/main/webapp";
                        // 相对于 user.dir = D:\workspace\dive-in-spring-boot
                        File docBaseFile = new File(relativePath);
                        if(docBaseFile.exists()) { // 路径是否存在
                            // 解决 Maven 多模块 JSP 无法读取的问题
                            context.setDocBase(docBaseFile.getAbsolutePath());
                        }
                    }
            );
        };
    }

}
