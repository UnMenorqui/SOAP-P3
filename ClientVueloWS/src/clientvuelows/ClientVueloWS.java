package clientvuelows;


public class ClientVueloWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int i = 3;
            int j = 20171107;
            int result = consultaLibres(i,j);
            System.out.println("Plazas libres = " + result);
            result = reservaPlaza(i, j);
            System.out.println("Plazas ocupadas = " + result);
            result = consultaLibres(i,j);
            System.out.println("Plazas libres = " + result);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }

    private static int consultaLibres(int idVuelo, int fecha) {
        app.soap.vuelos.VueloWS_Service service = new app.soap.vuelos.VueloWS_Service();
        app.soap.vuelos.VueloWS port = service.getVueloWSPort();
        return port.consultaLibres(idVuelo, fecha);
    }

    private static int reservaPlaza(int idVuelo, int fecha) {
        app.soap.vuelos.VueloWS_Service service = new app.soap.vuelos.VueloWS_Service();
        app.soap.vuelos.VueloWS port = service.getVueloWSPort();
        return port.reservaPlaza(idVuelo, fecha);
    }
    
}
