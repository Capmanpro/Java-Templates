package com.novikov.repository;

import com.novikov.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PhoneRepository extends JpaRepository<Phone,Long> {

}
