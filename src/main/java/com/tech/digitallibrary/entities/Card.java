package com.tech.digitallibrary.entities;

import com.tech.digitallibrary.models.EnumType.StatusType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "card")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private StatusType status;
    private String email;
    private Date validUpto;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Date createdOn;
    @UpdateTimestamp
    @Column(nullable = false)
    private Date updatedOn;
    @OneToOne(mappedBy = "card", cascade = CascadeType.ALL)
    private Student student;

    public Student getCard() {
        return student;
    }
}
