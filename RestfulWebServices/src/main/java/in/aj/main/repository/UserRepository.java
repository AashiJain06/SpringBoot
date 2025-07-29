package in.aj.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.aj.main.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
