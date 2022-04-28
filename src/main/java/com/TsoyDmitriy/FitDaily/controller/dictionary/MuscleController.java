package com.TsoyDmitriy.FitDaily.controller.dictionary;

import com.TsoyDmitriy.FitDaily.abstraction.controller.AbstractDictionaryController;
import com.TsoyDmitriy.FitDaily.domain.dictionary.Muscle;
import com.TsoyDmitriy.FitDaily.service.dictionary.MuscleService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("muscle")
@Api(description = "Controller for Muscle dictionary")
public class MuscleController extends AbstractDictionaryController<Muscle, MuscleService> {

    public MuscleController(MuscleService service) {
        super(service);
    }
}
