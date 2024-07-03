package com.hadeer.spring.mvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hadeer.spring.mvc.entity.TestCases;
import com.hadeer.spring.mvc.service.TestCaseService;

import java.util.List;

@RestController
@RequestMapping("/testcases")
public class TestCaseController {

    @Autowired
    private TestCaseService testCaseService;

    @PostMapping("/createTestCase")
    public void createTestCase(@RequestBody TestCases testCase) {
        testCaseService.createTestCase(testCase.getTestCaseName(), testCase.getDescription(), testCase.getCreatedBy());
    }

    @GetMapping("/getTestCase/{id}")
    public TestCases getTestCaseById(@PathVariable int id) {
        return testCaseService.getTestCaseById(id);
    }

    @PutMapping("/updateTestCase/{id}")
    public void updateTestCase(@PathVariable int id, @RequestBody TestCases testCase) {
        testCaseService.updateTestCase(id, testCase.getTestCaseName(), testCase.getDescription());
    }

    @DeleteMapping("/deleteTestCase/{id}")
    public void deleteTestCase(@PathVariable int id) {
        testCaseService.deleteTestCase(id);
    }

    @GetMapping("/testcase")
    public List<TestCases> getAllTestCases() {
        return testCaseService.getAllTestCases();
    }
}
