package com.bdaybumps.demo.Repository;

import com.bdaybumps.demo.Domains.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    UserEntity findByFirstName(String username);
    UserEntity findByEmail(String username);
}
