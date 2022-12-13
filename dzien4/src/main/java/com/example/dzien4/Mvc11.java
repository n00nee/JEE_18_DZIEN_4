package com.example.dzien4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet("/mvc11")
public class Mvc11 extends HttpServlet {
//    W servlecie w metodzie GET pobierz parametr o nazwie role a następnie zamień
//    zawartość na wielkie litery oraz dodaj prefix ROLE_ (dla wartości manager otrzymamy ROLE_MANAGER).
//    Ustaw atrybut o nazwie userRole ze zmienioną wartością.
//    Ustaw plik jsp jako plik widoku dla tego servletu.
//    W przypadku braku wartości ma się wyświetlić napis guest.


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String role = req.getParameter("role");
        if (Objects.nonNull(role)) {
            req.setAttribute("userRole", "ROLE_".concat(role.toUpperCase()));
        }
        getServletContext().getRequestDispatcher("/jsp1.jsp").forward(req, resp);
    }
}
