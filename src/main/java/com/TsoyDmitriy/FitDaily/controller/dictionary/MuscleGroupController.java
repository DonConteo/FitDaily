package com.TsoyDmitriy.FitDaily.controller.dictionary;

import com.TsoyDmitriy.FitDaily.abstraction.controller.AbstractDictionaryController;
import com.TsoyDmitriy.FitDaily.domain.dictionary.MuscleGroup;
import com.TsoyDmitriy.FitDaily.service.dictionary.MuscleGroupService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("muscleGroup")
@Api(description = "Controller for MuscleGroup dictionary")
public class MuscleGroupController extends AbstractDictionaryController<MuscleGroup, MuscleGroupService> {

    public MuscleGroupController(MuscleGroupService service) {
        super(service);
    }
}
