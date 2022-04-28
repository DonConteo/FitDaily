package com.TsoyDmitriy.FitDaily.service.model;

import com.TsoyDmitriy.FitDaily.domain.model.Approach;
import com.TsoyDmitriy.FitDaily.repository.model.ApproachRepo;
import com.TsoyDmitriy.FitDaily.service.exception.MyExpectationFailedException;
import com.TsoyDmitriy.FitDaily.service.exception.MyNoContentException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ApproachService {

    private final ApproachRepo approachRepo;

    public Approach findById(Long id) {
        return approachRepo.findById(id).orElseThrow(() -> new MyNoContentException("По вашему запросу подход не найден"));
    }

    public List<Approach> findAll() {
        if(approachRepo.findAll().isEmpty()) {
            throw new MyNoContentException("В списке подходов пусто");
        }
        return approachRepo.findAll();
    }

    public Approach save(Approach approach) {
        return approachRepo.save(approach);
    }

    public void delete(Long id) {
        approachRepo.deleteById(id);
        if(approachRepo.findById(id).isPresent()) {
            throw new MyExpectationFailedException("Не удалось удалить запись о подходе");
        }
    }
}
