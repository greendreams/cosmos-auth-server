package io.supercluster.cosmos.repository;

import io.supercluster.cosmos.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
