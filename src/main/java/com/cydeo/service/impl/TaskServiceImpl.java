package com.cydeo.service.impl;

import com.cydeo.dto.TaskDTO;
import com.cydeo.enums.Status;
import com.cydeo.service.TaskService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TaskServiceImpl extends AbstractMapService<TaskDTO,Long> implements TaskService {

    @Override
    public TaskDTO save(TaskDTO object) {

        if(object.getTaskStatus() == null){
            object.setTaskStatus(Status.OPEN);
        }

        if(object.getAssignedDate() == null){
            object.setAssignedDate(LocalDate.now());
        }

//        if(object.getId() == null){
//            object.setId(id);
//        }

        return super.save(object.getId(),object);
    }

    @Override
    public List<TaskDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void update(TaskDTO object) {
        super.update(object.getId(),object);
    }

    @Override
    public TaskDTO findById(Long id) {
        return super.findById(id);
    }

}