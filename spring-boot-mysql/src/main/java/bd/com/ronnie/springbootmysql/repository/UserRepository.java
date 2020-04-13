package bd.com.ronnie.springbootmysql.repository;

import bd.com.ronnie.springbootmysql.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
