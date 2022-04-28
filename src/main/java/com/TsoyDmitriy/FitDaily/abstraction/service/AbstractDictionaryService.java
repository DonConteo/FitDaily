package com.TsoyDmitriy.FitDaily.abstraction.service;

import com.TsoyDmitriy.FitDaily.abstraction.model.AbstractDictionary;
import com.TsoyDmitriy.FitDaily.abstraction.repository.AbstractDictionaryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public abstract class AbstractDictionaryService<E extends AbstractDictionary, R extends AbstractDictionaryRepo> {

    protected final R repo;

    public Optional<E> findById(Long id) {
        return repo.findById(id);
    }

    public ResponseEntity save(E object) {
        return new ResponseEntity<>(repo.save(object), HttpStatus.OK);
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    public List<E> findAll() {
        return repo.findAll();
    }
}
