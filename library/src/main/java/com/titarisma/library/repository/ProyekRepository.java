package com.titarisma.library.repository;

import com.titarisma.library.entity.Proyek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyekRepository extends JpaRepository<Proyek, Long> {
    // Custom query methods can be added here if needed
}
