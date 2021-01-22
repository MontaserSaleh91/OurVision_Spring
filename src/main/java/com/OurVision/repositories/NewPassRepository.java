package com.OurVision.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OurVision.models.NewPassport;

public interface NewPassRepository extends JpaRepository<NewPassport, Long>{

}
