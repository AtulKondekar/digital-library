package com.tech.digitallibrary.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentResponseModel {
    private Long id;
    private int age;
    private String name;
    private String country;
    private String email;
    private Long phoneNumber;
    private Date CreatedOn;
    private Date UpdatedOn;

    private CardResponseModel card;
}
