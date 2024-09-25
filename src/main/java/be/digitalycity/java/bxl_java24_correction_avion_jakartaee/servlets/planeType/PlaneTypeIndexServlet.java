package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.servlets.planeType;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.PlaneType;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.PlaneTypeService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/planeType")
public class PlaneTypeIndexServlet extends HttpServlet {

    @Inject
    private PlaneTypeService planeTypeService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<PlaneType> planeTypes = planeTypeService.getAll();
        req.setAttribute("planeTypes", planeTypes);
        req.getRequestDispatcher("/WEB-INF/pages/planeType/planeTypeIndex.jsp").forward(req,resp);
    }
}
