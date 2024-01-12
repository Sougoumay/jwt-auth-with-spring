package hamid.sougouma.jwtauthwithspring.repositories;

import hamid.sougouma.jwtauthwithspring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
