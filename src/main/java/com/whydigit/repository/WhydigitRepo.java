package com.whydigit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whydigit.entity.WhydigitVO;
@Repository
public interface WhydigitRepo extends JpaRepository<WhydigitVO, Integer>{

}
