package bd.com.ronnie.springbootmysql.repository;

import bd.com.ronnie.springbootmysql.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
