package com.TsoyDmitriy.FitDaily.controller.dictionary;

import com.TsoyDmitriy.FitDaily.abstraction.controller.AbstractDictionaryController;
import com.TsoyDmitriy.FitDaily.domain.dictionary.ExerciseType;
import com.TsoyDmitriy.FitDaily.service.dictionary.ExerciseTypeService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("muscle")
@Api(description = "Controller for ExerciseType dictionary")
public class ExerciseTypeController extends AbstractDictionaryController<ExerciseType, ExerciseTypeService> {

    public ExerciseTypeController(ExerciseTypeService service) {
        super(service);
    }
}
