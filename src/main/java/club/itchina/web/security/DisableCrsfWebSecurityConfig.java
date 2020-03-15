package club.itchina.web.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static org.springframework.core.Ordered.HIGHEST_PRECEDENCE;

/**
 * 曾梦想仗剑走天涯，看一看世界的繁华
 *
 * @author sabri
 * @version v1.0.1
 * @date 2020/3/12 16:22
 * @description To say something !
 */
@Configuration
@Order(HIGHEST_PRECEDENCE)
public class DisableCrsfWebSecurityConfig implements WebMvcConfigurer, IWebSecurityConfigurer {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {

    }
}
