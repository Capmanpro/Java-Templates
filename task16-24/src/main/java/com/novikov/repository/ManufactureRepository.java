package com.novikov.repository;

import com.novikov.entity.Manufacture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufactureRepository extends JpaRepository<Manufacture,Long> {
}
