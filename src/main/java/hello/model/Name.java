package hello.model;

public class Name {

    private final Long id;
    private final String name;

    public Name(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
