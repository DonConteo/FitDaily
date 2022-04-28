package com.TsoyDmitriy.FitDaily.controller.model;

import com.TsoyDmitriy.FitDaily.domain.model.Training;
import com.TsoyDmitriy.FitDaily.service.model.TrainingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("training")
@Api(description = "Controller for Training")
@RequiredArgsConstructor
public class TrainingController {

    private final TrainingService trainingService;

    @ApiOperation("Получение тренировки по id")
    @GetMapping("{id}")
    public Training findTrainingById(@PathVariable("id") Long id) {
        return trainingService.findById(id);
    }

    @ApiOperation("Создание тренировки")
    @PostMapping
    public Training saveTraining(@RequestBody Training training) {
        return trainingService.save(training);
    }

    @ApiOperation("Изменение существующего тренировки")
    @PutMapping
    public Training updateTraining(@RequestBody Training training) {
        return trainingService.save(training);
    }

    @ApiOperation("Удаление тренировки")
    @DeleteMapping("{id}")
    public void deleteTraining(@PathVariable("id") Long id) {
        trainingService.delete(id);
    }
}
