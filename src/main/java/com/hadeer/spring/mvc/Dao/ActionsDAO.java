package com.hadeer.spring.mvc.Dao;

import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import com.hadeer.spring.mvc.entity.Action;

import java.util.List;

public interface ActionsDAO {

    @SqlUpdate("INSERT INTO actions (ActionName, CreatedBy) VALUES (:name, :createdBy)")
    void insertAction(@Bind("name") String name, @Bind("createdBy") String createdBy);

    @SqlQuery("SELECT * FROM actions WHERE ID = :id")
    @RegisterBeanMapper(Action.class)
    Action findById(@Bind("id") long id);

    @SqlUpdate("UPDATE actions SET ActionName = :name WHERE ID = :id")
    void updateAction(@Bind("id") long id, @Bind("name") String name);

    @SqlUpdate("DELETE FROM actions WHERE ID = :id")
    void deleteAction(@Bind("id") long id);

    @SqlQuery("SELECT * FROM actions")
    @RegisterBeanMapper(Action.class)
    List<Action> getAllActions();
}
