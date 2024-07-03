package com.hadeer.spring.mvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hadeer.spring.mvc.entity.Action;
import com.hadeer.spring.mvc.service.TestCases_ActionsService;

import java.util.List;

@RestController
@RequestMapping("/testcases-actions")
public class TestCases_ActionsController {

    @Autowired
    private TestCases_ActionsService testCasesActionsService;

	    @PostMapping("/linkTestCaseAction")
	    public void linkTestCaseAction(@RequestParam int testCaseId, @RequestParam int actionId) {
	        testCasesActionsService.linkTestCaseAction(testCaseId, actionId);
	    }

    @GetMapping("/{testCaseId}/actions")
    public List<Action> getActionsForTestCase(@PathVariable int testCaseId) {
        return testCasesActionsService.getActionsForTestCase(testCaseId);
    }
}
