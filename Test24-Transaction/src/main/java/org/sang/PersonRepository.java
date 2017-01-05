package org.sang;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sang on 2017/1/5.
 */
public interface PersonRepository extends JpaRepository<Person,Long> {
}
