package com.bdaybumps.demo.Repository;

import com.bdaybumps.demo.Domains.FeedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedRepository extends JpaRepository<FeedEntity,Long> {
}
