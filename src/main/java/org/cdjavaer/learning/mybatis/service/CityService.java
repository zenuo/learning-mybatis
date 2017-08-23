package org.cdjavaer.learning.mybatis.service;

import org.cdjavaer.learning.mybatis.domain.City;
import org.cdjavaer.learning.mybatis.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 袁臻
 * 2017/08/23 14:58
 */
@Service
@Transactional
public class CityService {
    private CityMapper cityMapper;

    @Autowired
    protected CityService(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    public City find(Integer code) {
        return cityMapper.find(code);
    }

    public List<City> findAll() {
        return cityMapper.findAll();
    }
}
