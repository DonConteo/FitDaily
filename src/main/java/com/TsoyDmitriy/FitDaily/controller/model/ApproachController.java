package com.TsoyDmitriy.FitDaily.controller.model;

import com.TsoyDmitriy.FitDaily.domain.model.Approach;
import com.TsoyDmitriy.FitDaily.service.model.ApproachService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("approach")
@Api(description = "Controller for Approach")
@RequiredArgsConstructor
public class ApproachController {

    private final ApproachService approachService;

    @ApiOperation("Получение подхода по id")
    @GetMapping("{id}")
    public Approach findApproachById(@PathVariable("id") Long id) {
        return approachService.findById(id);
    }

    @ApiOperation("Создание подхода")
    @PostMapping
    public Approach saveApproach(@RequestBody Approach approach) {
        return approachService.save(approach);
    }

    @ApiOperation("Изменение существующего подхода")
    @PutMapping
    public Approach updateApproach(@RequestBody Approach approach) {
        return approachService.save(approach);
    }

    @ApiOperation("Удаление подхода")
    @DeleteMapping("{id}")
    public void deleteApproach(@PathVariable("id") Long id) {
        approachService.delete(id);
    }
}
