package com.axis.manipal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.manipal.Entity.Queue;

@Repository
public interface QueueRepository extends JpaRepository <Queue, Long> {

}
