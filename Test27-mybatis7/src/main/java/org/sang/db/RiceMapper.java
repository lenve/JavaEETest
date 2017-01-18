package org.sang.db;

import org.sang.bean.Rice;

import java.util.List;

/**
 * Created by sang on 17-1-17.
 */
public interface RiceMapper {
    List<Rice> findRiceByArea();
}
