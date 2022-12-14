package peaksofthousebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksofthousebackend.models.Admin;

import java.util.Optional;

public interface AdminRepo extends JpaRepository<Admin, Long> {

    Optional<Admin> findByEmail (String email);
    boolean existsByEmail(String email);
}
