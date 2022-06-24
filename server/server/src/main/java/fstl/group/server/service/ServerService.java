package fstl.group.server.service;

import fstl.group.server.model.Server;

import java.util.Collection;

public interface ServerService {
    Server create(Server server);
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Server delete(int id);
}
