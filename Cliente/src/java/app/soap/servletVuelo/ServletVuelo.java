package app.soap.servletVuelo;


import app.soap.vuelos.VueloWS_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;


@WebServlet(name = "ServletVuelo", urlPatterns = {"/ServletVuelo"})
public class ServletVuelo extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Vuelo/VueloWS.wsdl")
    private VueloWS_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try {
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet Vuelo</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet ClientServlet at " + request.getContextPath () + "</h1>");
                try {
                    int i = 3;
                    int j = 20171107;
                    int resultLibres = consultaLibres(i, j);
                    out.println("Plazas libres = " + resultLibres);
                    int result = reservaPlaza(i, j);
                    out.println("Plazas ocupadas = " + result);
                    resultLibres = consultaLibres(i, j);
                    out.println("Plazas libres = " + resultLibres);
                } catch (Exception ex) {
                    out.println("Exception: " + ex);
                }
                out.println("</body>");
                out.println("</html>");
            } finally {
                out.close();
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private int consultaLibres(int idVuelo, int fecha) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        app.soap.vuelos.VueloWS port = service.getVueloWSPort();
        return port.consultaLibres(idVuelo, fecha);
    }

    private int reservaPlaza(int idVuelo, int fecha) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        app.soap.vuelos.VueloWS port = service.getVueloWSPort();
        return port.reservaPlaza(idVuelo, fecha);
    }

}
