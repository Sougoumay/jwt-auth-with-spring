package hamid.sougouma.jwtauthwithspring.service;

import hamid.sougouma.jwtauthwithspring.entity.Role;
import hamid.sougouma.jwtauthwithspring.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role createRole(Role role) {
        return roleRepository.save(role);
    }



}
