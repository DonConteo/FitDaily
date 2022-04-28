package com.TsoyDmitriy.FitDaily.service.dictionary;

import com.TsoyDmitriy.FitDaily.abstraction.service.AbstractDictionaryService;
import com.TsoyDmitriy.FitDaily.domain.dictionary.Gender;
import com.TsoyDmitriy.FitDaily.repository.dictionary.GenderRepo;
import org.springframework.stereotype.Service;

@Service
public class GenderService extends AbstractDictionaryService<Gender, GenderRepo> {

    public GenderService(GenderRepo repo) {
        super(repo);
    }
}
