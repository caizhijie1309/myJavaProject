package com.finaldemo.dao.p;

import com.finaldemo.entity.p.UserP;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jin on 06/01/2018.
 */
public interface UserPRepository extends JpaRepository<UserP, Long> {

}
