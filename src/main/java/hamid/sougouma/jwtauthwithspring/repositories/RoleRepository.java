package hamid.sougouma.jwtauthwithspring.repositories;

import hamid.sougouma.jwtauthwithspring.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer> {
}
