package com.technews.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
// start by writing annotations at the class level and then work downward.

// marks this as a persistable object, so that the User class can map to a table.
@Entity
//specifies properties that should be ignored when serializing this object to JSON. The two arguments that follow the annotation are the properties to be ignored. Note that you could add many more if necessary.
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
// specifies the name of the table that this class maps to. If this annotation isn't present, the table name will be the class name by default.
@Table(name = "user")

public class User {
    // creating 8 instance variable and adding instance-level annotations.
    // First, we want to attach the @Id and @GeneratedValue annotations to the id private variable. The first signals that id will be used as the unique identifier, and the second denotes that it will be a generated value. We'll pass an argument into @GeneratedValue to say that this number should be generated automatically, by adding (strategy = GenerationType.AUTO).
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    //  @Column(unique = true) to email, to signal that this value must be unique; duplicates won't be allowed.
    @Column(unique = true)
    private String email;
    private String password;
    //  @Transient to the loggedIn variable. @Transient signals to Spring Data JPA that this data is NOT to be persisted in the database, because we don't need or want a user's logged-in status to persist in the data.
    @Transient
    boolean loggedIn;
    // these three instance variables are lists, which are collections of objects of the same type
    private List<Post> posts;
    private List<Vote> votes;
    private List<Comment> comments;

}