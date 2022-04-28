package com.TsoyDmitriy.FitDaily.domain.dictionary;

import com.TsoyDmitriy.FitDaily.abstraction.model.AbstractDictionary;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "d_gender")
@RequiredArgsConstructor
public class Gender extends AbstractDictionary {
}
