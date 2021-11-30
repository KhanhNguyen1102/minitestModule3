package quan_ly_sinh_vien.service;

import quan_ly_sinh_vien.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService{
    private List<Student> students;

    public StudentServiceImpl() {
        students = new ArrayList<>();
        students.add(new Student(0,"Khanh",9,9,9));
        students.add(new Student(1,"Lala",10,10,10));
        students.add(new Student(2,"Mo Mo ",8,10,9));
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public Student findById(int id) {
        for (Student student:students) {
            if (student.getId() == id){
                return student;
            }
        }
        return null;
    }

    @Override
    public void update(int id, Student student) {
       students.set(id,student);
    }

    @Override
    public void remove(int id) {
        students.remove(id);
    }
}
