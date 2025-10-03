import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Festival {
    private HashMap<Integer,Entrada> entradas;
    private HashMap<Integer,Usuario> usuarios;
    private HashMap<Integer,Cupones> cupones;
    private ArrayList<Ventas> ventas;

    public Festival() {
        this.entradas = new HashMap<>();
        this.usuarios = new HashMap<>();
        this.cupones = new HashMap<>();
        this.ventas = new ArrayList<>();
        ventas.add(new Boleteria(200,0,true,0,new Persona(4665558,"Morena Hidalgo")));
        ventas.add(new Online(200,0,true,0,"www.FestivalJavaParcial.com"));
    }

    public enum tipoEntrada{
        GOLD,SIMPLE,COMUN;
    }
    public enum tipoVenta{
        BOLETERIA,ONLINE;
    }
    public enum producto{
        BEBIDA_SIN_ALCOHOL,PIZZA,HAMBURGUESA,PANCHO;
    }

    private void venderEntrada(int dni,int telefono,String mail,String nombre,tipoEntrada tipoEntrada,tipoVenta  tipoVenta) {
        Usuario titular = new Usuario(dni, nombre, mail, telefono);

        Iterator<Usuario> iterator = usuarios.values().iterator();
        while (iterator.hasNext()) {
            Usuario usuario = iterator.next();
            if (titular.equals(usuario)) {
                System.out.println("NO PUEDE CONCRETARSE LA COMPRA YA QUE EL USUARIO REGISTRA UNA ENTRADA");

            } else {
                if (tipoEntrada.equals(tipoVenta.BOLETERIA)) {
                    Iterator<Ventas> iterator2 = ventas.iterator();
                    while (iterator2.hasNext()) {
                        Ventas ventas = iterator2.next();
                        if (ventas instanceof Boleteria) {
                            ventas.Vender(1);
                        }
                    }
                } else {
                    Iterator<Ventas> iterator2 = ventas.iterator();
                    while (iterator2.hasNext()) {
                        Ventas ventas = iterator2.next();
                        if (ventas instanceof Online) {
                            ventas.Vender(1);
                        }
                    }
                    if (tipoEntrada == tipoEntrada.GOLD) {


                        System.out.println("INGRESE A QUE VANDA DESEA VER: ");
                        Gold entrada = new Gold(4, titular, 80000, 23, false, Gold.Banda.GREEN_DAY);
                        entradas.put(entrada.getIdUnico(), entrada);

                    } else {


                        System.out.println("INGRESE A QUE DIA DESEA VER: ");
                        Simple entrada = new Simple(1, titular, 60000, 20, false, Simple.DiaFestival.PRIMER);
                        entradas.put(entrada.getIdUnico(), entrada);
                    }
                }
            }
        }
    }

        private void escanear ( int idEntrada){
            Iterator<Entrada> iteratorx = entradas.values().iterator();
            while (iteratorx.hasNext()) {
                Entrada entrada = iteratorx.next();
                if (entrada.getIdUnico() == idEntrada) {
                    if (!entrada.isEscaneado()) {
                        System.out.println("ESCANEANDO ENTRADA");
                        entrada.setEscaneado(true);
                    } else {
                        System.out.println("ENTRADA YA ESCANEADA");
                    }
                }
            }
        }

        private void nuevoPuestoVentaBoleteria ( int stock, tipoVenta tipoVenta, String nombre,int dni){
            System.out.println("NUEVO PUESTO DE VENTA");
            if (tipoVenta == tipoVenta.BOLETERIA) {
                Boleteria puestoNuevo = new Boleteria(stock, 0, true, 0, new Persona(dni, nombre));
                System.out.println("NUEVO PUESTO CREADO CON EXITO, A CONTINUACION DATOS DEL PUESTO:");
                System.out.println(puestoNuevo.toString());
                ventas.add(puestoNuevo);
            }

        }

        private void nuevoPuestoVentaOnline( int stock, tipoVenta tipoVenta, String dominio){
        System.out.println("NUEVO PUESTO DE VENTA");
        if (tipoVenta == tipoVenta.ONLINE) {
            Online puestoNuevo = new Online(stock, 0, true, 0, dominio);
            System.out.println("NUEVO PUSTO CREADO CON EXITO, A CONTINUACION DATOS DEL PUESTO: ");
            System.out.println(puestoNuevo.toString());
            ventas.add(puestoNuevo);
        }
        }
        private void verPuestoBoleteria (Persona persona){
        Iterator<Ventas> iterator2 = ventas.iterator();
        while (iterator2.hasNext()) {
            Ventas ventax = iterator2.next();
            if (ventax instanceof Boleteria) {
                Boleteria ventap= (Boleteria)ventax;
                if(ventap.getPersonaAcargo().equals(persona)){
                    System.out.println(ventax.toString());}
                else{
                    System.out.println("NO EXISTE BOLETERIA CON ESA PERSONA A CARGO");
                }
            }
        }
    }
    private void verPuestoOnline(String dominio){
    Iterator<Ventas> iterator2 = ventas.iterator();
    while (iterator2.hasNext()) {
        Ventas ventax = iterator2.next();
        if (ventax instanceof Online) {
            Online ventap= (Online)ventax;
            if(ventap.getDominio().equals(dominio)){
                System.out.println(ventap.toString());
            }else{
                System.out.println("NO EXISTE VENTA ONLINE CON ESE DOMINIO");
            }
        }
    }
    }
    private void agregarCupon(producto Producto,int id, double precio){
        Cupones nuevoCupon= new Cupones(Producto,false,id,precio);
        cupones.put(id, nuevoCupon);
    }
    private void verCuponesVendidos(){
        Iterator<Cupones> iterator = cupones.values().iterator();
        while (iterator.hasNext()) {
            Cupones cupon = iterator.next();
            System.out.println(cupon.toString());
        }
    }

    private void canjear ( int idCupon){
        Iterator<Cupones> iterator = cupones.values().iterator();
        while (iterator.hasNext()) {
            Cupones cupon = iterator.next();
            if(!cupon.isEscaneadoCupon()){
                System.out.println("CANJEANDO CUPON CON EXITO");
                cupon.setEscaneadoCupon(true);
            }
            else{
                System.out.println("ERROR CUPON YA CANJEADO");
            }
        }
    }
}







