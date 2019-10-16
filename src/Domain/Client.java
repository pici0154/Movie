package Domain;

public class Client {

    private String name;
    private int CNP;

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", CNP=" + CNP +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCNP() {
        return CNP;
    }

    public void setCNP(int CNP) {
        this.CNP = CNP;
    }


    public Client(String name, int CNP) {
        this.name = name;
        this.CNP = CNP;
    }



}
