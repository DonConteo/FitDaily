package com.TsoyDmitriy.FitDaily.controller.model;

import com.TsoyDmitriy.FitDaily.domain.model.ExerciseBlock;
import com.TsoyDmitriy.FitDaily.service.model.ExerciseBlockService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("exerciseBlock")
@Api(description = "Controller for ExerciseBlock")
@RequiredArgsConstructor
public class ExerciseBlockController {

    private final ExerciseBlockService exerciseBlockService;

    @ApiOperation("Получение блока упражнений по id")
    @GetMapping("{id}")
    public ExerciseBlock findExerciseBlockById(@PathVariable("id") Long id) {
        return exerciseBlockService.findById(id);
    }

    @ApiOperation("Создание блока упражнений")
    @PostMapping
    public ExerciseBlock saveExerciseBlock(@RequestBody ExerciseBlock exerciseBlock) {
        return exerciseBlockService.save(exerciseBlock);
    }

    @ApiOperation("Изменение существующего блока упражнений")
    @PutMapping
    public ExerciseBlock updateExerciseBlock(@RequestBody ExerciseBlock exerciseBlock) {
        return exerciseBlockService.save(exerciseBlock);
    }

    @ApiOperation("Удаление блока упражнений")
    @DeleteMapping("{id}")
    public void deleteExerciseBlock(@PathVariable("id") Long id) {
        exerciseBlockService.delete(id);
    }
}
