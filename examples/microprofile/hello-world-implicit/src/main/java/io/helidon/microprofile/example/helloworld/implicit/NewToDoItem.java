package io.helidon.microprofile.example.helloworld.implicit;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class NewToDoItem {
    @NotBlank
    @Size(min = 5, max = 100)
    private String name;

    @Size(min = 5, max = 1000)
    private String description;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "NewToDoItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
