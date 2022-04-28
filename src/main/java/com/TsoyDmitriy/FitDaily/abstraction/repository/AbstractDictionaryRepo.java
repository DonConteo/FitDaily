package com.TsoyDmitriy.FitDaily.abstraction.repository;

import com.TsoyDmitriy.FitDaily.abstraction.model.AbstractDictionary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

@NoRepositoryBean
public interface AbstractDictionaryRepo<E extends AbstractDictionary> extends JpaRepository<E, Long> {

    @Modifying
    @Transactional
    void deleteById(Long id);
}
