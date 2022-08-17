package com.eac.eac.Repository;

import com.eac.eac.Entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    
}
