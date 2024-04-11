package org.example;

public class Topics {

    private String Description;
    private String id;
    private String Name;

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Topics(String description, String id, String name) {
        super();
        this.Description = description;
        this.id = id;
        this.Name = name;
    }

    public Topics() {
    }




}
