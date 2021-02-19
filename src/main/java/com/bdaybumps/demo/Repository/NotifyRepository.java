package com.bdaybumps.demo.Repository;

import com.bdaybumps.demo.Domains.NotifyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotifyRepository extends JpaRepository<NotifyEntity,Long> {

}
