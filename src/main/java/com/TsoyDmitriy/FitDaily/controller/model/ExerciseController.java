package com.TsoyDmitriy.FitDaily.controller.model;

import com.TsoyDmitriy.FitDaily.domain.model.Exercise;
import com.TsoyDmitriy.FitDaily.service.model.ExerciseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("exercise")
@Api(description = "Controller for Exercise")
@RequiredArgsConstructor
public class ExerciseController {

    private final ExerciseService exerciseService;

    @ApiOperation("Получение упражнения по id")
    @GetMapping("{id}")
    public Exercise findExerciseById(@PathVariable("id") Long id) {
        return exerciseService.findById(id);
    }

    @ApiOperation("Создание упражнения")
    @PostMapping
    public Exercise saveExercise(@RequestBody Exercise exercise) {
        return exerciseService.save(exercise);
    }

    @ApiOperation("Изменение существующего упражнения")
    @PutMapping
    public Exercise updateExercise(@RequestBody Exercise exercise) {
        return exerciseService.save(exercise);
    }

    @ApiOperation("Удаление упражнения")
    @DeleteMapping("{id}")
    public void deleteExercise(@PathVariable("id") Long id) {
        exerciseService.delete(id);
    }
}
