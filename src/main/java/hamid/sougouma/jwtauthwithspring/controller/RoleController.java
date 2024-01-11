package hamid.sougouma.jwtauthwithspring.controller;

import hamid.sougouma.jwtauthwithspring.entity.Role;
import hamid.sougouma.jwtauthwithspring.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/role")
@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/create")
    public Role createNewRole(@RequestBody Role role) {
        return roleService.createRole(role);
    }
}
