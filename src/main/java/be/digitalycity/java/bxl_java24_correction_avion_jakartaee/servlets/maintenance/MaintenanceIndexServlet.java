package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.servlets.maintenance;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.Maintenance;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.MaintenanceService;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.PlaneService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.catalina.LifecycleState;

import java.io.IOException;
import java.util.List;

@WebServlet("/maintenance")
public class MaintenanceIndexServlet extends HttpServlet {

    @Inject
    private MaintenanceService maintenanceService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Maintenance> maintenances = maintenanceService.getAll();
        req.setAttribute("maintenances", maintenances);
        req.getRequestDispatcher("/WEB-INF/pages/maintenance/maintenanceIndex.jsp").forward(req, resp);
    }
}
