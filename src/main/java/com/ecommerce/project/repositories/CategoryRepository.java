package com.ecommerce.project.repositories;

import com.ecommerce.project.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

                                                         //<type of entity, type of primary key of entity>
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
