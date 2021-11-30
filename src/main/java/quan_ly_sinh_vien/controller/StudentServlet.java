package quan_ly_sinh_vien.controller;

import quan_ly_sinh_vien.model.Student;
import quan_ly_sinh_vien.service.StudentServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "StudentServlet", value = "/student")
public class StudentServlet extends HttpServlet {
    StudentServiceImpl studentService = new StudentServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "showList":
                showList(request,response);
                break;
            case "update":
                showUpdateForm(request,response);
                break;
            case "delete":
                deleteStudent(request,response);
                break;
            default:
                showList(request,response);
        }
    }

    private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        studentService.remove(id);
        response.sendRedirect("/student");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "update":
                updateStudent(request,response);
                break;
            default:
                showList(request,response);
        }
    }

    private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double mathScore=Double.parseDouble(request.getParameter("mathScore"));
        double physicalScore=Double.parseDouble(request.getParameter("physicalScore"));
        double chemicalScore=Double.parseDouble(request.getParameter("chemicalScore"));
        Student student = studentService.findById(id);
        student.setName(name);
        student.setMathScore(mathScore);
        student.setPhysicalScore(physicalScore);
        student.setChemicalScore(chemicalScore);
        studentService.update(id,student);
        response.sendRedirect("/student");
    }

    private void showUpdateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        RequestDispatcher dispatcher = request.getRequestDispatcher("student/update.jsp");
        Student student = studentService.findById(id);
        request.setAttribute("student",student);
        dispatcher.forward(request,response);

    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("student/list.jsp");
        request.setAttribute("students",this.studentService.getStudents());
        dispatcher.forward(request,response);
    }

}
