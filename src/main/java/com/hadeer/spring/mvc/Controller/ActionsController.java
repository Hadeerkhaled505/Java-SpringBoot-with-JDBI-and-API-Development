package com.hadeer.spring.mvc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hadeer.spring.mvc.entity.Action;
import com.hadeer.spring.mvc.service.ActionsService;

import java.util.List;

@RestController
@RequestMapping("/actions")
public class ActionsController {

    @Autowired
    private ActionsService actionsService;

    @PostMapping("/addaction")
    public void createAction(@RequestBody Action action) {
        actionsService.createAction(action.getActionName(), action.getCreatedBy());
    }
//    @PostMapping("/addaction")
//    public ResponseEntity<Void> addAction(@RequestBody Action action) {
//        actionsService.createAction(action.getActionName(), action.getCreatedBy());
//        return ResponseEntity.status(HttpStatus.CREATED).build();
//    }


    @GetMapping("/getaction/{id}")
    public Action getActionById(@PathVariable int id) {
        return actionsService.getActionById(id);
    }

    @PutMapping("/updateAction/{id}")
    public void updateAction(@PathVariable int id, @RequestBody Action action) {
        actionsService.updateAction(id, action.getActionName());
    }

    @DeleteMapping("/deleteAction/{id}")
    public void deleteAction(@PathVariable int id) {
        actionsService.deleteAction(id);
    }

    @GetMapping("/action")
    public List<Action> getAllActions() {
        return actionsService.getAllActions();
    }
}
