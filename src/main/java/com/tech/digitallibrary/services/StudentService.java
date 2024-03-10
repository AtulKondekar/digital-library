package com.tech.digitallibrary.services;

import com.tech.digitallibrary.entities.Card;
import com.tech.digitallibrary.entities.Student;
import com.tech.digitallibrary.models.CardRequestModel;
import com.tech.digitallibrary.models.CardResponseModel;
import com.tech.digitallibrary.models.StudentRequestModel;
import com.tech.digitallibrary.models.StudentResponseModel;
import com.tech.digitallibrary.repositories.CardRepository;
import com.tech.digitallibrary.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private StudentRepository studentRepository;

    public StudentResponseModel createStudent(StudentRequestModel req){
        System.out.println("Body ---> "+ req.toString());
        Card card = new Card();
        Student student = new Student(null, req.getAge(), req.getName(), req.getCountry(), req.getEmail(), req.getPhoneNumber(), null, null, card );
        if(req.getCardId() != null){
            card = cardRepository.getReferenceById(Long.valueOf(req.getCardId()));
        } else if(req.getCard() != null){
            CardRequestModel cr = req.getCard();
            card.setStatus(cr.getStatus());
            card.setEmail(cr.getEmail());
            card.setValidUpto(cr.getValidUpto());
        }
        student.setCard(card);
        card.setStudent(student);
//        System.out.println("Student object log ---> "+ student.toString());
        cardRepository.flush();
        card = cardRepository.save(card);
//        student = studentRepository.save(student);
        student = card.getStudent();
//        System.out.println("Student object log - after--> "+ card.toString());
        return new StudentResponseModel(student.getId(), student.getAge(), student.getCountry(), student.getCountry(), student.getEmail(), student.getPhoneNumber(), null, null,
                new CardResponseModel(card.getId(), card.getStatus(), card.getEmail(), card.getValidUpto(), card.getCreatedOn(), card.getUpdatedOn()));
    }

}
