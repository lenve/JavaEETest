package org.sang;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sang on 17-1-6.
 */
public interface PersonRepository extends JpaRepository<Person,Long> {
}
