package com.tech.digitallibrary.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int age;
    private String name;
    private String country;
    private String email;
    private Long phoneNumber;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Date CreatedOn;
    @UpdateTimestamp
    @Column(nullable = false)
    private Date UpdatedOn;
    @OneToOne
    @JoinColumn(name = "card_id")
    private Card card;
}
