package clienthotelws;


public class ClientHotelWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int i = 3;
            int j = 20171107;
            int result = consultaLibresH(i,j);
            System.out.println("Plazas libres = " + result);
            result = reservaHabitacion(i, j);
            System.out.println("Plazas ocupadas = " + result);
            result = consultaLibresH(i,j);
            System.out.println("Plazas libres = " + result);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
    
    private static int consultaLibresH(int idHotel, int fecha) {
        app.soap.hoteles.HotelWS_Service service = new app.soap.hoteles.HotelWS_Service();
        app.soap.hoteles.HotelWS port = service.getHotelWSPort();
        return port.consultaLibres(idHotel, fecha);
    }

    private static int reservaHabitacion(int idHotel, int fecha) {
        app.soap.hoteles.HotelWS_Service service = new app.soap.hoteles.HotelWS_Service();
        app.soap.hoteles.HotelWS port = service.getHotelWSPort();
        return port.reservaHabitacion(idHotel, fecha);
    }
    
}
