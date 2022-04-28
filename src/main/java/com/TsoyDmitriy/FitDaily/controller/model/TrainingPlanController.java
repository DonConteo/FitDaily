package com.TsoyDmitriy.FitDaily.controller.model;

import com.TsoyDmitriy.FitDaily.domain.model.TrainingPlan;
import com.TsoyDmitriy.FitDaily.service.model.TrainingPlanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("trainingPlan")
@Api(description = "Controller for TrainingPlan")
@RequiredArgsConstructor
public class TrainingPlanController {

    private final TrainingPlanService trainingPlanService;

    @ApiOperation("Получение тренировочного плана по id")
    @GetMapping("{id}")
    public TrainingPlan findTrainingById(@PathVariable("id") Long id) {
        return trainingPlanService.findById(id);
    }

    @ApiOperation("Создание тренировочного плана")
    @PostMapping
    public TrainingPlan saveTraining(@RequestBody TrainingPlan trainingPlan) {
        return trainingPlanService.save(trainingPlan);
    }

    @ApiOperation("Изменение существующего тренировочного плана")
    @PutMapping
    public TrainingPlan updateTraining(@RequestBody TrainingPlan trainingPlan) {
        return trainingPlanService.save(trainingPlan);
    }

    @ApiOperation("Удаление тренировочного плана")
    @DeleteMapping("{id}")
    public void deleteTraining(@PathVariable("id") Long id) {
        trainingPlanService.delete(id);
    }
}
