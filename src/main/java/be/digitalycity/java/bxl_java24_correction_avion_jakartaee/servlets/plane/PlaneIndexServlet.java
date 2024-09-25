package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.servlets.plane;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.Plane;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.PlaneService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/plane")
public class PlaneIndexServlet extends HttpServlet {

    @Inject
    private PlaneService planeService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Plane> planes = planeService.getAll();
        req.setAttribute("planes", planes);
        req.getRequestDispatcher("/WEB-INF/pages/plane/planeIndex.jsp").forward(req, resp);
    }
}
