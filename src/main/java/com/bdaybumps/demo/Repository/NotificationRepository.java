package com.bdaybumps.demo.Repository;

import com.bdaybumps.demo.Domains.NotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<NotificationEntity,Long> {

}
