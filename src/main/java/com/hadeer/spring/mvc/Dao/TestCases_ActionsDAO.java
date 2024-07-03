package com.hadeer.spring.mvc.Dao;

import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.hadeer.spring.mvc.entity.Action;

import java.util.List;

public interface TestCases_ActionsDAO {

    @SqlUpdate("INSERT INTO testCases_actions (TestCaseID, ActionID) VALUES (:testCaseId, :actionId)")
    void linkTestCaseAction(@Bind("testCaseId") int testCaseId, @Bind("actionId") int actionId);

    @SqlQuery("SELECT * FROM actions a JOIN testCases_actions ta ON a.ID = ta.ActionID WHERE ta.TestCaseID = :testCaseId")
    @RegisterBeanMapper(Action.class)
    List<Action> getActionsForTestCase(@Bind("testCaseId") int testCaseId);
}
