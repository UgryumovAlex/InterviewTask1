package models;

/**
 * Создать builder для класса Person со следующими полями:
 * String firstName, String lastName, String middleName, String country,
 * String address, String phone, int age, String gender.
 *
 *
 * Геттерами и сеттерами не буду захламлять код
 * */
public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int    age;
    private String gender;

    public Person(String firstName, String lastName, String middleName, String country, String address, String phone, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static Person.PersonBuilder builder() {
        return new Person.PersonBuilder();
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int    age;
        private String gender;

        public PersonBuilder() {}

        public Person.PersonBuilder firstName(final String firstName) {
             this.firstName = firstName;
             return this;
        }

        public Person.PersonBuilder lastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Person.PersonBuilder middleName(final String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Person.PersonBuilder country(final String country) {
            this.country = country;
            return this;
        }

        public Person.PersonBuilder address(final String address) {
            this.address = address;
            return this;
        }

        public Person.PersonBuilder phone(final String phone) {
            this.phone = phone;
            return this;
        }

        public Person.PersonBuilder age(final int age) {
            this.age = age;
            return this;
        }

        public Person.PersonBuilder gender(final String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this.firstName, this.lastName, this.middleName, this.country, this.address, this.phone, this.age, this.gender);
        }
    }
}
