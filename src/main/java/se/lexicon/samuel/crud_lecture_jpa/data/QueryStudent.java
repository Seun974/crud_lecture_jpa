package se.lexicon.samuel.crud_lecture_jpa.data;

import se.lexicon.samuel.crud_lecture_jpa.entity.Student;

import java.util.Collection;

public interface QueryStudent {
    Collection<Student> findByStudentLastName(String lastName);
}
