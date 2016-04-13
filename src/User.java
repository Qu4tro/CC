/**
 * Created by quatro on 4/12/16.
 */
public class User {

    private String id;
    private String ip;
    private int port;

    public User(String id, String ip, int port) {
        this.id = id;
        this.ip = ip;
        this.port = port;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (port != user.getPort()) return false;
        if (!id.equals(user.getId())) return false;
        return ip != null ? ip.equals(user.getIp()) : user.getIp() == null;

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + port;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", ip='" + ip + '\'' +
                ", port=" + port +
                '}';
    }
}
