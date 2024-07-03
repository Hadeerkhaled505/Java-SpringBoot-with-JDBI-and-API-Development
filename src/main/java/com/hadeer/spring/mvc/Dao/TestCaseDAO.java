package com.hadeer.spring.mvc.Dao;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.hadeer.spring.mvc.entity.TestCases;

import java.util.List;

public interface TestCaseDAO {

    @SqlUpdate("INSERT INTO testCases (TestCaseName, Description, CreatedBy) VALUES (:name, :description, :createdBy)")
    void insertTestCase(String name, String description, String createdBy);

    @SqlQuery("SELECT * FROM testCases WHERE ID = :id")
    TestCases findById(int id);

    @SqlUpdate("UPDATE testCases SET TestCaseName = :name, Description = :description WHERE ID = :id")
    void updateTestCase(int id, String name, String description);

    @SqlUpdate("DELETE FROM testCases WHERE ID = :id")
    void deleteTestCase(int id);

    @SqlQuery("SELECT * FROM testCases")
    List<TestCases> getAllTestCases();
}
