package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {

    String firstName;
    String lastname;
    String peselId;

    public LibraryUser(String firstName, String lastname, String peselId) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.peselId = peselId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPeselId() {
        return peselId;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryUser)) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(peselId, that.peselId);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastname.hashCode();
        result = 31 * result + peselId.hashCode();
        return result;
    }
}
