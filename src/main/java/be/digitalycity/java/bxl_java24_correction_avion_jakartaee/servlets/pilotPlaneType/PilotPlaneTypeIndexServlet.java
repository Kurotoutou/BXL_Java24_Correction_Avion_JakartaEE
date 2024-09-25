package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.servlets.pilotPlaneType;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.PilotPlaneType;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.PilotPlanTypeService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/pilotPlaneType")
public class PilotPlaneTypeIndexServlet extends HttpServlet {

    @Inject
    PilotPlanTypeService pilotPlanTypeService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<PilotPlaneType> pilotPlaneTypes = pilotPlanTypeService.getAll();
        req.setAttribute("pilotPlaneTypes", pilotPlaneTypes);
        req.getRequestDispatcher("/WEB-INF/pages/pilotPlaneType/pilotPlaneTypeIndex.jsp").forward(req, resp);
    }
}
