// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


Panel panel = new Panel();
//prender y apagar el auto
panel.motor.encender();

//verifica si esta encendido
        System.out.println("----------------------Motor------------------------");
panel.encendido();

//verifica estado motor
panel.estadoMotor();

// estado inyeccion
 panel.pruebaInyeccion();

        System.out.println("----------------------Asientos------------------------");

//abrochar cinturon
 panel.asiento.abrocharCinturon();

//verifica si esta abrochado el cinturon
panel.isAbrocharCinturon();

//prender el enfriador y apagar el calentador de asientos
        panel.asiento.activarEnfriamientoAsiento();
        panel.asiento.apagarCalefactorAsiento();

 //muestra si estan funcionando o no
        panel.isEnfriadorAsientoEncendido();
        panel.isCalentadorAsientoEncendido();




        System.out.println("----------------------ruedas------------------------");

// ruedas
        //para setear aire usamos del 1 al 100
        panel.neumaticos.setTire1(100);
        panel.neumaticos.setTire2(20);
        panel.neumaticos.setTire3(100);
        panel.neumaticos.setTire4(100);
        // mostrar datos de ruedas
        panel.ruedas();


// puertas
        System.out.println("----------------------Puertas------------------------");
        panel.carroceria.destrancarPuertas();
        panel.carroceria.cerrarMaletero();
                panel.isMaleteroAbierto();

        panel.carroceria.cerrarPuertasDelanteras();
        panel.isPuertasdelanterasabiertas();

        panel.carroceria.abrirPuertasTraseras();
                panel.isPuertasTraserasAbiertas();

                //accesorios
        System.out.println("----------------------Accesorios------------------------");
        panel.accesorios.encenderRadio();
                panel.isRadio();

        panel.accesorios.encenderCalefaccion();
                panel.isCalefaccion();

        panel.accesorios.apagarAireAcondicionado();
        panel.isAireAcondicionado();



    }
}