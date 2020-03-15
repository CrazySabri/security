package club.itchina.web.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 曾梦想仗剑走天涯，看一看世界的繁华
 *
 * @author sabri
 * @version v1.0.1
 * @date 2020/3/12 16:07
 * @description To say something !
 */
@Configuration
public class HeadersWebSecurityConfig implements WebMvcConfigurer, IWebSecurityConfigurer {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .headers()
                .cacheControl()
                .and()
                .xssProtection()
                .and()
                .contentTypeOptions()
                .and();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {

    }
}
