package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class StudentEntity {

    @Id
    private Long id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private LocalDate birthday;
}
