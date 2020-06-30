package com.graduation.config;

import com.graduation.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main.html").setViewName("index");
//        registry.addViewController("/about.html").setViewName("about");
        registry.addViewController("/about.html").setViewName("forum/forum");

        registry.addViewController("/contact.html").setViewName("contact");
        registry.addViewController("/services.html").setViewName("services");
        registry.addViewController("/team.html").setViewName("team");
        registry.addViewController("/register.html").setViewName("register");
        registry.addViewController("/job.html").setViewName("job");
        registry.addViewController("/news.html").setViewName("news");


//        person页面的跳转
        registry.addViewController("/person.html").setViewName("person");
        registry.addViewController("/person_ph.html").setViewName("person_ph");
        registry.addViewController("/person_password.html").setViewName("person_password");



//        registry.addViewController("/cost.html").setViewName("func/cost");


    }

    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/charge","/content/addQuestion","/content/addAnswer","/toEmploy","/person.html","/toEmploy").excludePathPatterns("","/","/index.html","/user/checklogin","/user/register");

    }
}
