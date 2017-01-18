package org.sang.db;

import org.sang.bean.Noodle;

import java.util.List;

/**
 * Created by sang on 17-1-17.
 */
public interface NoodleMapper {
    List<Noodle> findNoodleByArea();
}
