package kr.hi.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.hi.test.entity.PetTourEntity;

@Repository
public interface PetTourRepository
        extends JpaRepository<PetTourEntity, Long> {
	 List<PetTourEntity> findByAreaCode(String areaCode);
}
