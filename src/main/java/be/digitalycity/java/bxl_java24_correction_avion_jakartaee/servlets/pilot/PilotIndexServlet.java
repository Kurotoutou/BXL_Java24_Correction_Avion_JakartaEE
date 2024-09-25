package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.servlets.pilot;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.Pilot;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.PilotService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/pilot")
public class PilotIndexServlet extends HttpServlet {

    @Inject
    private PilotService pilotService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Pilot> pilots = pilotService.getAll();
        req.setAttribute("pilots", pilots);
        req.getRequestDispatcher("/WEB-INF/pages/pilot/pilotIndex.jsp").forward(req, resp);
    }
}
