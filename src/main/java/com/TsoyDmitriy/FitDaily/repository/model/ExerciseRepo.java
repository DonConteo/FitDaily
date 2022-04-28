package com.TsoyDmitriy.FitDaily.repository.model;

import com.TsoyDmitriy.FitDaily.domain.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ExerciseRepo extends JpaRepository<Exercise, Long> {

    @Modifying
    @Transactional
    void deleteById(Long id);
}
