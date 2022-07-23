package com.venkat.web.controller;

import com.venkat.web.model.Employee;
import com.venkat.web.service.EmpService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = { "/myEmpCreate", "/home" })
public class EmpServlet extends HttpServlet {

    private static Logger logger = LogManager.getLogger(EmpServlet.class);

    private EmpService empService;

    @Override
    public void init() {
        logger.info("init method is called...");
        empService = new EmpService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("doGet method is called...");
        String action = req.getServletPath();
        RequestDispatcher dispatcher = null;
        if (action.equals("/home")) {
            dispatcher = req.getRequestDispatcher("index.jsp");
        }else{
            dispatcher = req.getRequestDispatcher("index.jsp");
        }
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("doPost method is called...");
        resp.setContentType("text/html;charset=UTF-8");

        String name = req.getParameter("name");
        String designation = req.getParameter("designation");
        String salary = req.getParameter("salary");
        try {
            Employee employee = new Employee();
            employee.setName(name);
            employee.setDesignation(designation);
            employee.setSalary(Double.parseDouble(salary));
            empService.createEmp(employee);
            istEmployees(req, resp);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Exception thrown.", e.getCause());
        }
    }

    private void istEmployees(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException, ClassNotFoundException {

        List<Employee> employees = empService.getEmployees();
        request.setAttribute("employees", employees);
        RequestDispatcher dispatcher = request.getRequestDispatcher("empDisplay.jsp");
        dispatcher.forward(request, response);
    }


}
