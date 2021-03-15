package com.bdaybumps.demo.Repository;

import com.bdaybumps.demo.Domains.BfriendEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BfriendsRepository extends JpaRepository<BfriendEntity,Long> {
    @Override
    void delete(BfriendEntity bfriendEntity);
}
