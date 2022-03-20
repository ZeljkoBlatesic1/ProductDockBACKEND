package com.productDock.empMngr.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import com.productDock.empMngr.model.Emply;

import java.util.Optional;

//query methods in spring
public interface EmplyRepo extends JpaRepository<Emply, Long> {
    void deleteEmplyById(Long id);

    Optional<Emply> findEmplyById(Long id);
}
