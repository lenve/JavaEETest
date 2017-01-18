package org.sang.db;

import org.sang.bean.City;

import java.util.List;

/**
 * Created by sang on 17-1-17.
 */
public interface CityMapper {
    List<City> findCityByPid(Long id);
}
