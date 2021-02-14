package com.bdaybumps.demo.Repository;

import com.bdaybumps.demo.Domains.FriendsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendsRepository extends JpaRepository<FriendsEntity,Long> {
}
