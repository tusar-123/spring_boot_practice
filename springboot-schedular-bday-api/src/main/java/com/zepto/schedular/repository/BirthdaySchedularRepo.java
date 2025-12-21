package com.zepto.schedular.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zepto.schedular.entity.BirthdaySchedularEntity;

@Repository
public interface BirthdaySchedularRepo extends JpaRepository<BirthdaySchedularEntity, Integer>{
	  @Query("""
		        SELECT u
		        FROM BirthdaySchedularEntity u
		        WHERE DAY(u.dob) = DAY(CURRENT_DATE)
		          AND MONTH(u.dob) = MONTH(CURRENT_DATE)
		    """)
		    List<BirthdaySchedularEntity> findTodayBirthdayEmails();
}
