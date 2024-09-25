package be.digitalycity.java.bxl_java24_correction_avion_jakartaee.servlets.owner;

import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.entities.Owner;
import be.digitalycity.java.bxl_java24_correction_avion_jakartaee.services.OwnerService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/owner")
public class OwnerIndexServlet extends HttpServlet {

    @Inject
    private OwnerService ownerService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Owner> owners = ownerService.getAll();
        req.setAttribute("owners", owners);
        req.getRequestDispatcher("/WEB-INF/pages/owner/ownerIndex.jsp").forward(req, resp);
    }
}
