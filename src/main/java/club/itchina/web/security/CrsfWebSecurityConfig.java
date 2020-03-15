package club.itchina.web.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 曾梦想仗剑走天涯，看一看世界的繁华
 *
 * @author sabri
 * @version v1.0.1
 * @date 2020/3/12 14:51
 * @description To say something !
 */
@Configuration
@Order
public class CrsfWebSecurityConfig implements WebMvcConfigurer, IWebSecurityConfigurer {

    @Bean
    public CsrfTokenRepository csrfTokenRepository() {
        return new HttpSessionCsrfTokenRepository();
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                .requireCsrfProtectionMatcher(request -> "POST".equalsIgnoreCase(request.getMethod()))
                .csrfTokenRepository(csrfTokenRepository()); // 替换成httpSession的保存方式
    }

    @Override
    public void configure(WebSecurity web) throws Exception {

    }
}
