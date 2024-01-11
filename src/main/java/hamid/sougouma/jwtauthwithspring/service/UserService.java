package hamid.sougouma.jwtauthwithspring.service;

import hamid.sougouma.jwtauthwithspring.entity.Role;
import hamid.sougouma.jwtauthwithspring.entity.User;
import hamid.sougouma.jwtauthwithspring.repositories.RoleRepository;
import hamid.sougouma.jwtauthwithspring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    public User register(User user) {
        return userRepository.save(user);
    }

    public void initRolesAndUsers() {
        Role adminRole = addRole("admin","Admin role");
        roleRepository.save(adminRole);

        Role userRole = addRole("user","Default role for newly created record");
        roleRepository.save(userRole);

        addUser("admin123","Sougouma Ali","Hamid", "admin@pass",adminRole);
        addUser("user123","Issa Yaya","Tahir", "user@pass",userRole);

    }

    private Role addRole(String name, String description) {
        Role role = new Role();
        role.setName(name);
        role.setDescription(description);
        roleRepository.save(role);

        return role;
    }

    private void addUser(String userName, String firstName, String lastName, String password, Role role) {
        User user = new User();
        user.setUserName(userName);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPassword(password);

        Set<Role> roles = new HashSet<>();
        roles.add(role);
        user.setRoles(roles);

        // enregistrer l'utilisateur dans la base de données
        userRepository.save(user);
    }
}
