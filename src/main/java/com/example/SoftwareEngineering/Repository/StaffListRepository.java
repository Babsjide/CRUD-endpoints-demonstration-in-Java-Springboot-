package com.example.SoftwareEngineering.Repository;

import com.example.SoftwareEngineering.Entity.StaffList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffListRepository extends JpaRepository<StaffList, String> {
    StaffList findStaffById(String id);
}
