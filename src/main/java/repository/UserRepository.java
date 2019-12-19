package repository;

import Classes.User;
import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
