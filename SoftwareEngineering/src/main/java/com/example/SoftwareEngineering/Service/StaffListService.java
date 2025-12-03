package com.example.SoftwareEngineering.Service;

import com.example.SoftwareEngineering.Entity.StaffList;
import com.example.SoftwareEngineering.Repository.StaffListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffListService {
    @Autowired
    StaffListRepository staffListRepository;
    public StaffList addStaff(StaffList staffList) {
        return staffListRepository.save(staffList);
    }

    public StaffList getStaff(String id) {
        return staffListRepository.findStaffById(id);
    }

    public StaffList updateStaffList(StaffList staffList) {
        return staffListRepository.save(staffList);
    }

    public void deleteStaff(String id) {
        staffListRepository.deleteById(id);
    }
}
