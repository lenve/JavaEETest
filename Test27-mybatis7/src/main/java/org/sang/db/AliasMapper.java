package org.sang.db;

import org.sang.bean.Alias;

/**
 * Created by sang on 17-1-17.
 */
public interface AliasMapper {
    Alias findAliasByPid(Long id);
}
