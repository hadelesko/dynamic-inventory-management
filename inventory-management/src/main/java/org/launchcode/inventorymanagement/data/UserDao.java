package org.launchcode.inventorymanagement.data;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDao extends CrudRepository<User, Integer> {
}
