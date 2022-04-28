package com.TsoyDmitriy.FitDaily.controller.dictionary;

import com.TsoyDmitriy.FitDaily.abstraction.controller.AbstractDictionaryController;
import com.TsoyDmitriy.FitDaily.domain.dictionary.Gender;
import com.TsoyDmitriy.FitDaily.service.dictionary.GenderService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("muscle")
@Api(description = "Controller for Gender dictionary")
public class GenderController extends AbstractDictionaryController<Gender, GenderService> {

    public GenderController(GenderService service) {
        super(service);
    }
}
