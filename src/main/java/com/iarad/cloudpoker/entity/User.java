package com.iarad.cloudpoker.entity;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

/**
 * Represents a user in the application
 */
public class User {
    UUID id;
    UserRole role;
    AccountStatus status;

    String username;
    String password;

    String firstName;
    String lastName;
    String emailAddress;

    Date dateOfBirth;
    Instant lastLogin;
}
