package com.hadeer.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hadeer.spring.mvc.Dao.ActionsDAO;
import com.hadeer.spring.mvc.entity.Action;

import java.util.List;

@Service
public class ActionsService {

    @Autowired
    private ActionsDAO actionsDAO;

    public void createAction(String name, String createdBy) {
        actionsDAO.insertAction(name, createdBy);
    }

    public Action getActionById(int id) {
        return actionsDAO.findById(id);
    }

    public void updateAction(int id, String name) {
        actionsDAO.updateAction(id, name);
    }

    public void deleteAction(int id) {
        actionsDAO.deleteAction(id);
    }

    public List<Action> getAllActions() {
        return actionsDAO.getAllActions();
    }
}
