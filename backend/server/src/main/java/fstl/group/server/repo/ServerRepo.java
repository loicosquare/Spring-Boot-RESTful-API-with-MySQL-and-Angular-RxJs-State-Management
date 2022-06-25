package fstl.group.server.repo;

import fstl.group.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Loic Sanou
 * @version 1.0
 * @since 25/06/2022
 */
public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
