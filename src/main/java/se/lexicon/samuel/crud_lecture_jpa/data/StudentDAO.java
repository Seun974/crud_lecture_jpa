package se.lexicon.samuel.crud_lecture_jpa.data;

import se.lexicon.samuel.crud_lecture_jpa.entity.Student;

import java.util.Collection;

public interface StudentDAO extends QueryStudent{
    Student create(Student student);
    Student findById(Integer studentId);
    Collection<Student> findAll();
    Student update(Student student);
    boolean delete(Integer studentId);


}
