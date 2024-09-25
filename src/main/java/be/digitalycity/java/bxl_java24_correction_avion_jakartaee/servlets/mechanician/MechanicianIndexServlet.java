package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.servlets.mechanician;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.Mechanician;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.MechanicianService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.List;

@WebServlet("/mechanician")
public class MechanicianIndexServlet extends HttpServlet {

    @Inject
    private MechanicianService mechanicianService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Mechanician> mechanicians = mechanicianService.getAll();
        req.setAttribute("mechanicians", mechanicians);
        req.getRequestDispatcher("/WEB-INF/pages/mechanician/mechanicianIndex.jsp").forward(req, resp);
    }
}
