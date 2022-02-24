package net.javaguidesspringboot.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.javaguidesspringboot.model.country;

@Repository
public interface Countries extends JpaRepository<country,Integer>{
	
	@Query("from country c where c.id<100")
	List<country> findAll(/*Pageable pageable*/);
	
	@Query("from country c where c.name like %:keyword%")
	List<country> findAll( @Param("keyword") String keyword);

	

}
