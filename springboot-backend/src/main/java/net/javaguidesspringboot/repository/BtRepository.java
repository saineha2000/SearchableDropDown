package net.javaguidesspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguidesspringboot.model.page1;

@Repository
public interface BtRepository extends JpaRepository<page1, Long>{

	List<page1> findAll();

}
