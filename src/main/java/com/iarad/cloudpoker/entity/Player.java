package com.iarad.cloudpoker.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.iarad.cloudpoker.serializer.CustomInstantSerializer;
import com.iarad.cloudpoker.serializer.CustomLocalDateSerializer;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDate;

/**
 * Player
 *
 * @author Stuart MacKenzie
 */
@Component
public class Player {
    long id;
    String username;

    String firstName;
    String lastName;
    String emailAddress;


    @JsonSerialize(using = CustomLocalDateSerializer.class)
    LocalDate dateOfBirth;

    @JsonSerialize(using = CustomInstantSerializer.class)
    Instant lastLogin;

    int winCount = 0;
    int lossCount = 0;

    AccountStatus accountStatus = AccountStatus.ACTIVE;

    PlayStatus playStatus = PlayStatus.NONE;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Instant getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Instant lastLogin) {
        this.lastLogin = lastLogin;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public int getLossCount() {
        return lossCount;
    }

    public void setLossCount(int lossCount) {
        this.lossCount = lossCount;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public PlayStatus getPlayStatus() {
        return playStatus;
    }

    public void setPlayStatus(PlayStatus playStatus) {
        this.playStatus = playStatus;
    }
}
