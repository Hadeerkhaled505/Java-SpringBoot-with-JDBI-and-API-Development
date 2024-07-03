package com.hadeer.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hadeer.spring.mvc.Dao.TestCases_ActionsDAO;
import com.hadeer.spring.mvc.entity.Action;

import java.util.List;

@Service
public class TestCases_ActionsService {

    @Autowired
    private TestCases_ActionsDAO testCasesActionsDAO;

    public void linkTestCaseAction(int testCaseId, int actionId) {
        testCasesActionsDAO.linkTestCaseAction(testCaseId, actionId);
    }

    public List<Action> getActionsForTestCase(int testCaseId) {
        return testCasesActionsDAO.getActionsForTestCase(testCaseId);
    }
}
