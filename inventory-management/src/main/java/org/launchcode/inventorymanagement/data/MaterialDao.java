package org.launchcode.inventorymanagement.data;

import org.launchcode.inventorymanagement.models.Material;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
@Repository
@Transactional
public interface MaterialDao extends CrudRepository<Material, Integer> {
}
