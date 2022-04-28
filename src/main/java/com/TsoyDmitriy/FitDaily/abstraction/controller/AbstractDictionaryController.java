package com.TsoyDmitriy.FitDaily.abstraction.controller;

import com.TsoyDmitriy.FitDaily.abstraction.model.AbstractDictionary;
import com.TsoyDmitriy.FitDaily.abstraction.service.AbstractDictionaryService;
import com.TsoyDmitriy.FitDaily.service.exception.MyExpectationFailedException;
import com.TsoyDmitriy.FitDaily.service.exception.MyNoContentException;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
public class AbstractDictionaryController<E extends AbstractDictionary, S extends AbstractDictionaryService> {

    protected final S service;

    @ApiOperation("Получение позиции из справочника по id")
    @GetMapping("{id}")
    public ResponseEntity<E> findById(@PathVariable Long id) {
        if(service.findById(id).isPresent()) {
            return new ResponseEntity(service.findById(id).get(), HttpStatus.OK);
        } throw new MyNoContentException("Позиция в справочнике не найдена");
    }

    @ApiOperation("Найти все позиции в справочнике")
    @GetMapping
    public List<E> findAll() {
        if(service.findAll().isEmpty()) {
            throw new MyNoContentException("В запрашиваемом справочнике пусто");
        }
        return service.findAll();
    }

    @ApiOperation("Сохранение позиции в справочник")
    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResponseEntity save(@RequestBody E object) {
        return service.save(object);
    }

    @ApiOperation("Изменение позиции в справочнике")
    @PutMapping
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResponseEntity updateById(@RequestBody E object) {
        return service.save(object);
    }

    @ApiOperation("Удаление позиции из справочника по id")
    @DeleteMapping("{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
        if(service.findById(id).isPresent()) {
            throw new MyExpectationFailedException("Не удалось удалить позицию из справочника");
        }
    }
}
