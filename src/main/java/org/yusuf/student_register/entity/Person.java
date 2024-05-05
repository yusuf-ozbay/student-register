package org.yusuf.student_register.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Person extends BaseEntity{

    private String firstName;
    private String lastName;
    private short age;
    private String job;
    private String phoneNumber;

    @Override
    public String toString() {
        return this.firstName+" "+this.lastName;
    }
}
