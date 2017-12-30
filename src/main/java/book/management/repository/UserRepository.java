package book.management.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import book.management.model.Users;

@Repository
public interface UserRepository extends CrudRepository<Users,Long>{

}
