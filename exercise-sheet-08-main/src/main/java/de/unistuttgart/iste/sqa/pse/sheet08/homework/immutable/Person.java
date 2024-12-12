package de.unistuttgart.iste.sqa.pse.sheet08.homework.immutable;

import java.util.Date;

/**
 * Represents an immutable person with a name and birthdate.
 *
 * Name and birthdate must not be {@code null}, and the name must not be blank.
 *
 * @author Schweikert
 */
public final class Person {

    private final String name;
    private final Date birthDate;

    /**
     * Creates a new person with the given name and birthdate.
     *
     * @param name      Name of the person. Must not be {@code null} or blank.
     * @param birthDate Birth date of the person. Must not be {@code null}.
     */
    public Person(final String name, final Date birthDate) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("A person must not have a null or blank name.");
        }
        if (birthDate == null) {
            throw new IllegalArgumentException("A person's birth date must not be null.");
        }
        this.name = name;
        this.birthDate = new Date(birthDate.getTime()); // Defensive copy to ensure immutability
    }

    /**
     * @return This person's name.
     */
    public String getName() {
        return name;
    }

    /**
     * @return A defensive copy of this person's birth date.
     */
    public Date getBirthDate() {
        return new Date(birthDate.getTime()); // Defensive copy to protect internal state
    }
}
