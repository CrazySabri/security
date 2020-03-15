package club.itchina.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * 曾梦想仗剑走天涯，看一看世界的繁华
 *
 * @author sabri
 * @version v1.0.1
 * @date 2020/3/12 14:04
 * @description 确保唯一
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private List<IWebSecurityConfigurer> configurers;

    @PostConstruct
    public void init() {
        AnnotationAwareOrderComparator.sort(configurers);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        configurers.forEach(c -> {
            try {
                c.configure(web);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        configurers.forEach(c -> {
            try {
                c.configure(http);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
