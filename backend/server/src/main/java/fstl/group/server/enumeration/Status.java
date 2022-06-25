package fstl.group.server.enumeration;

/**
 * @author Loic Sanou
 * @version 1.0
 * @since 25/06/2022
 */
public enum Status {
    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
