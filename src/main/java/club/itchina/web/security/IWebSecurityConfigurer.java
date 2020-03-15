package club.itchina.web.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 曾梦想仗剑走天涯，看一看世界的繁华
 *
 * @author sabri
 * @version v1.0.1
 * @date 2020/3/12 13:55
 * @description To say something !
 */
public interface IWebSecurityConfigurer {

    default void configure(HttpSecurity http) throws Exception {
        // DO NOTHING
    }

    default void configure(WebSecurity web) throws Exception {
        // DO NOTHING
    }

}
