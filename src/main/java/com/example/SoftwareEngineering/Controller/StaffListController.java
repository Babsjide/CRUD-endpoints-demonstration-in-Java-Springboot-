package com.example.SoftwareEngineering.Controller;

import com.example.SoftwareEngineering.Entity.StaffList;
import com.example.SoftwareEngineering.Service.StaffListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/staffList/v1")
public class StaffListController {
    private final StaffListService staffListService;

    @Autowired
    public StaffListController(StaffListService staffListService) {
        this.staffListService = staffListService;
    }

    @PostMapping("/addStaff") // Create/add new staff detail
    public ResponseEntity<StaffList> addStaff(@RequestBody StaffList staffList) {
        StaffList savedStaff = staffListService.addStaff(staffList);
        return ResponseEntity.ok(savedStaff);
    }

    @GetMapping("/getStaffById/{id}") // Retrieve a staff detail using the Staff's ID
    public ResponseEntity<StaffList> getStaff(@PathVariable("id") String id) {
        final StaffList staffById = staffListService.getStaff(id);
        if (staffById != null) {
            return ResponseEntity.ok(staffById);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/updateStaff") // Update the staff list
    public ResponseEntity<StaffList> updateStaffList(@RequestBody StaffList staffList) {
        StaffList updatedList = staffListService.updateStaffList(staffList);
        return ResponseEntity.ok(updatedList);

    }

    @DeleteMapping("/deleteStaffById/{id}") // Delete a staff record using the ID
    public ResponseEntity<StaffList> deleteStaff(@PathVariable("id") String id) {
        if (id != null) {
            staffListService.deleteStaff(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();

    }


}
