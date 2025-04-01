/**
    * Interfaz para un servicio RMI de corredores de bolsa
    * Debe heredar de java.rmi.Remote
    * Debe manejar RemoteException en sus métodos
    */
   public interface Corredor extends Remote
    {
     String listarTitulos() throws RemoteException;
     void comprar(String nombre, int cantidad) throws RemoteException;
     void vender(String nombre, int cantidad) throws RemoteException;
     }