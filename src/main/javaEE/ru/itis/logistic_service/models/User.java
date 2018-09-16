package ru.itis.logistic_service.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class User {

    private Long id;

    private String email;
    private String hashPassword;


    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private List<Expense> expenses;

//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getHashPassword() {
//        return hashPassword;
//    }
//
//    public void setHashPassword(String hashPassword) {
//        this.hashPassword = hashPassword;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public User(Long id, String email, String hashPassword, String firstName, String lastName, String phoneNumber) {
//        this.id = id;
//        this.email = email;
//        this.hashPassword = hashPassword;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.phoneNumber = phoneNumber;
//    }
//
//    private User(Builder builder) {
//        this.email = builder.email;
//        this.hashPassword = builder.hashPassword;
//
//        this.firstName = builder.firstName;
//        this.lastName = builder.lastName;
//        this.phoneNumber = builder.phoneNumber;
//    }
//
//    public static class Builder {
//        private Long id;
//
//        private String email;
//        private String hashPassword;
//
//        private String firstName;
//        private String lastName;
//        private String phoneNumber;
//
//        public Builder email(String email) {
//            this.email = email;
//            return this;
//        }
//
//        public Builder hashPassword(String hashPassword) {
//            this.hashPassword = hashPassword;
//            return this;
//        }
//
//        public Builder firstName(String firstName) {
//            this.firstName = firstName;
//            return this;
//        }
//
//        public Builder lastName(String lastName) {
//            this.lastName = lastName;
//            return this;
//        }
//
//
//        public Builder phoneNumber(String phoneNumber) {
//            this.phoneNumber = phoneNumber;
//            return this;
//        }
//
//        public User build() {
//            return new User(this);
//        }
//    }
//
//    public static Builder builder() {
//        return new Builder();
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return Objects.equals(id, user.id) &&
//                Objects.equals(email, user.email) &&
//                Objects.equals(hashPassword, user.hashPassword) &&
//                Objects.equals(firstName, user.firstName) &&
//                Objects.equals(lastName, user.lastName) &&
//                Objects.equals(phoneNumber, user.phoneNumber);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(id, email, hashPassword, firstName, lastName, phoneNumber);
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", email='" + email + '\'' +
//                ", hashPassword='" + hashPassword + '\'' +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                '}';
//    }
//

}