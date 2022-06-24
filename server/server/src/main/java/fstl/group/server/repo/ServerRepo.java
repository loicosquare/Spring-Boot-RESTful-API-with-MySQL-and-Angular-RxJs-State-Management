package fstl.group.server.repo;

import fstl.group.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server,  Long> {
    Server findByIpAddress(String ipAdress);
}
