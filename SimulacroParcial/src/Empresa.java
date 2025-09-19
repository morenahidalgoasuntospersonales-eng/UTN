import java.util.ArrayList;

public class Empresa {
    private Vehiculos vehiculo;
    private VehiculoPasajeros vehiculos;
    private VehiculosCarga vehiculox;
    private VehiculosEmpresariales vehiculoz;
    private Choferes chofer;
    private Viajes viajeee;
    ArrayList<Vehiculos> registroVehiculos=new ArrayList<Vehiculos>();
    ArrayList<VehiculoPasajeros> registroVehiculoPasajeros=new ArrayList<VehiculoPasajeros>();
    ArrayList<VehiculosCarga> registroVehiculosCarga=new ArrayList<VehiculosCarga>();
    ArrayList<VehiculosEmpresariales> registroVehiculosEmpresariales=new ArrayList<VehiculosEmpresariales>();
    ArrayList<Viajes> registroViajes=new ArrayList<Viajes>();
    ArrayList<Choferes> registroChoferes=new ArrayList<Choferes>();
    public Empresa() {
    }



    public void RegistroVehiculox(Vehiculos vehiculos){
        registroVehiculos.add(vehiculos);
    }

    public void RegistroVehiculoPax(VehiculoPasajeros vehiculoPasajeros){
        registroVehiculoPasajeros.add(vehiculoPasajeros);
    }

    public void RegistroVehiculoCarx(VehiculosCarga vehiculosCarga){
        registroVehiculosCarga.add(vehiculosCarga);
    }
    public void RegistroVehiculoEmprex(VehiculosEmpresariales vehiculosEmpresariales){
        registroVehiculosEmpresariales.add(vehiculosEmpresariales);
    }
    public void registroViajessx(Viajes viaje){
    registroViajes.add(viaje);
    }
    public void RegistroChoferex(Choferes chofer){
        registroChoferes.add(chofer);
    }
    public void eliminarDeRegistroVehiculos(Vehiculos vehiculox){
        registroVehiculos.remove(vehiculox);
    }
    public void eliminarDeRegistroVehiculosPax(VehiculoPasajeros vehiculox){
        registroVehiculoPasajeros.remove(vehiculox);
    }
    public void eliminarDeRegistroVehiculosCarx(VehiculosCarga vehiculox){
        registroVehiculosCarga.remove(vehiculox);
    }
    public void eliminarDeRegistroVehiculosEmprx(VehiculosEmpresariales vehiculox){
        registroVehiculosEmpresariales.remove(vehiculox);
    }
    public void eliminarDeRegistroChoferes(Choferes choferex){
        registroChoferes.remove(choferex);
    }
    public void eliminarDeRegistroDeViajes(Viajes viaje){
        registroViajes.remove(viaje);
    }
    public void imprimirVehiculoPorPatente(String patente){
        for()
    }



}
