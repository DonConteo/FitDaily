package com.TsoyDmitriy.FitDaily.repository.dictionary;

import com.TsoyDmitriy.FitDaily.abstraction.repository.AbstractDictionaryRepo;
import com.TsoyDmitriy.FitDaily.domain.dictionary.Gender;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepo extends AbstractDictionaryRepo<Gender> {
}
