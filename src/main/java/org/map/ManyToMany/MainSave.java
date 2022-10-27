package org.map.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MainSave {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Employee emp1 = new Employee();
        emp1.setEmpId(1201);
        emp1.setEmpName("Vikas");

        Employee emp2 = new Employee();
        emp2.setEmpId(2141);
        emp2.setEmpName("Brijesh");

        Employee emp3 = new Employee();
        emp3.setEmpId(154);
        emp3.setEmpName("Chandani");

        Project pr1 = new Project();
        pr1.setpId(230);
        pr1.setProjectName("Food Online");

        Project pr2 = new Project();
        pr2.setProjectName("Dermastore");
        pr2.setpId(321);

        List<Project> projectList = new ArrayList<>();
        projectList.add(pr1);
        projectList.add(pr2);
        emp1.setProjects(projectList);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        pr2.setEmployeeList(employeeList);

        Session session = factory.openSession();
        session.persist(emp1);
        session.persist(emp2);
        session.persist(emp3);
        session.persist(pr1);
        session.persist(pr2);
        session.beginTransaction().commit();

        Project project = session.get(Project.class, 321);
        System.out.println(project.getProjectName());
        for (Employee emp : project.getEmployeeList()) {
            System.out.println(emp.getEmpName());
        }


        Employee emp = session.get(Employee.class, 1201);
        System.out.println(emp.getEmpName());
        for (Project pr : emp.getProjects()) {
            System.out.println(pr.getProjectName());
        }
        session.close();
        factory.close();
    }
}
