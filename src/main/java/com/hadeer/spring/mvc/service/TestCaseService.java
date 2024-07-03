package com.hadeer.spring.mvc.service;

import org.springframework.stereotype.Service;

import com.hadeer.spring.mvc.Dao.TestCaseDAO;
import com.hadeer.spring.mvc.entity.TestCases;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class TestCaseService {

    @Autowired
    private TestCaseDAO testCaseDAO;

    public void createTestCase(String name, String description, String createdBy) {
        testCaseDAO.insertTestCase(name, description, createdBy);
    }

    public TestCases getTestCaseById(int id) {
        return testCaseDAO.findById(id);
    }

    public void updateTestCase(int id, String name, String description) {
        testCaseDAO.updateTestCase(id, name, description);
    }

    public void deleteTestCase(int id) {
        testCaseDAO.deleteTestCase(id);
    }

    public List<TestCases> getAllTestCases() {
        return testCaseDAO.getAllTestCases();
    }
}
