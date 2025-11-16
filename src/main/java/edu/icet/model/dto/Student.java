package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    private Long id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private LocalDate birthday;

}
