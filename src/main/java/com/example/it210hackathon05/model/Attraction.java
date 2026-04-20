package com.example.it210hackathon05.model;

public class Attraction {
    private Long id;
    private String name;
    private String location;
    private String description;
    private Double rating;
    private String covermage;

    public Attraction() {
    }

    public Attraction(Long id, String name, String location, String description, Double rating, String covermage) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.description = description;
        this.rating = rating;
        this.covermage = covermage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getCovermage() {
        return covermage;
    }

    public void setCovermage(String covermage) {
        this.covermage = covermage;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", covermage='" + covermage + '\'' +
                '}';
    }
}
