package hw;

public class Client {
    private Long id;
    private String name;
    private Integer age;

    public Client(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client(id: " + id + ", name: " + name + ", age: " + age + ")";
    }

    @Override
    public int hashCode() {
        int idHash = id == null ? 0 : id.hashCode();
        int nameHash = name == null ? 0 : name.hashCode();
        int ageHash = age == null ? 0 : age.hashCode();

        return idHash + nameHash + ageHash;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (this == other) return true;
        if (getClass() != other.getClass()) return false;

        Client otherClient = (Client) other;
        return this.id == otherClient.id && this.name.equals(otherClient.name) && this.age == otherClient.age;
    }
}
