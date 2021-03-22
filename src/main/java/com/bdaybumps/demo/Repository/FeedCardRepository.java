package com.bdaybumps.demo.Repository;

import com.bdaybumps.demo.Domains.FeedCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedCardRepository extends JpaRepository<FeedCardEntity,Long> {
}
