package org.ss.department.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<String> getDepartment() {
        return ResponseEntity.ok("Department for Janitha");
    }
}