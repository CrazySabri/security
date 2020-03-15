package club.itchina;

import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

/**
 * 曾梦想仗剑走天涯，看一看世界的繁华
 *
 * @author sabri
 * @version v1.0.1
 * @date 2020/3/12 16:26
 * @description To say something !
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/byname")
    public User getUserInfo(@RequestParam String name) {
        User u = new User("sabri", "123456", Collections.emptyList());
        return u;
    }
}
