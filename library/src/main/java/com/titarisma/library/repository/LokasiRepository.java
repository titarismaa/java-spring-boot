package com.titarisma.library.repository;

import com.titarisma.library.entity.Lokasi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LokasiRepository extends JpaRepository<Lokasi, Long> {
    // Custom query methods can be added here if needed
}
