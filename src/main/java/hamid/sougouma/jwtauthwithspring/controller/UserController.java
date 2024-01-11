package hamid.sougouma.jwtauthwithspring.controller;

import hamid.sougouma.jwtauthwithspring.entity.User;
import hamid.sougouma.jwtauthwithspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void initRolesAndUsers() {
        userService.initRolesAndUsers();
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @GetMapping("/forAdmin")
    public String forAdmin() {
        return "Cette interface est reservéé aux administrateurs";
    }

    @GetMapping("/forUser")
    public String forUser() {
        return "Cette interface est reservéé aux autres utilisateurs";
    }
}
