package fstl.group.server.service;

import fstl.group.server.model.Server;

import java.io.IOException;
import java.util.Collection;

/**
 * @author Loic Sanou
 * @version 1.0
 * @since 25/06/2022
 */
public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
