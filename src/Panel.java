
public class Panel {
    Glasses vidrios;
    Seat asiento;
    Accessories accesorios;
    Car_body carroceria;
    Tires neumaticos;
    Engine motor;

    public Panel() {
        vidrios = new Glasses();
        asiento = new Seat();
        accesorios = new Accessories();
        carroceria = new Car_body();
        neumaticos = new Tires(89, 100, 100, 90);
        motor = new Engine();
    }

    // Parte del motor
    public void encendido() {
        if (motor.isEncendido()) {
            System.out.println("Motor encendido");
        }else{
        System.out.println("Motor apagado");}
    }

    public void pruebaInyeccion() {
        if (motor.isEncendido()) {
            System.out.println("Inyección: OK");
        } else {
            System.out.println("Inyección: Mal estado");
        }
    }

    public void estadoMotor() {
        if (motor.isEncendido()) {
            if (motor.verificarMotor()) {
                System.out.println("Estado del motor: OK");
            } else {
                System.out.println("Estado del motor: Mal estado");
            }
        }
    }

    // Parte de las ventanas
    public void ventanasBajas() {
        if (vidrios.VentanasBajadas()) {
            System.out.println("Ventanas bajas");
        } else {
            System.out.println("Ventanas cerradas");
        }
    }

    // Parte de los asientos
    public void isCalentadorAsientoEncendido() {
        if (motor.isEncendido()) {
            if (asiento.isCalefactorAsientoEncendido()) {
                System.out.println("Calentador de asiento encendido");
            } else {
                System.out.println("Calentador de asiento apagado");
            }
        }
    }

    public void isEnfriadorAsientoEncendido() {
        if (motor.isEncendido()) {
            if (asiento.isEnfriadorAsientoEncendido()) {
                System.out.println("Enfriador de asiento encendido");
            } else {
                System.out.println("Enfriador de asiento apagado");
            }
        }
    }

    public void isAbrocharCinturon() {
        if (motor.isEncendido()) {
            if (asiento.abrocharCinturon()) {
                System.out.println("Cinturón abrochado");
            } else {
                System.out.println("Cinturón desabrochado");
            }
        }
    }
    // parte de las ruedas
    public void ruedas(){
        if (neumaticos.calculatePressure()==4) {
            System.out.println("presion alta");
        }

        if (neumaticos.calculatePressure()==3) {
            System.out.println("presion normal");
        }
        if (neumaticos.calculatePressure()==2) {
            System.out.println("presion baja");
        }
        if (neumaticos.calculatePressure()==1) {
            System.out.println("presion baja");
        }
        if (neumaticos.calculatePressure()==11) {
            System.out.println("neumatico pinchado");
        }
        if (neumaticos.calculatePressure()==22) {
            System.out.println("neumatico pinchado");
        }
        if (neumaticos.calculatePressure()==33) {
            System.out.println("neumatico pinchado");
        }
        if (neumaticos.calculatePressure()==44) {
            System.out.println("neumatico pinchado");
        }


        }
        // parte carroceria
        public void isPuertasTraserasAbiertas() {
            if (!carroceria.isPuertasTrancadas()) {
                if (carroceria.isPuertaTraseraAbierta()) {
                    System.out.println("Puerta trasera abierta");

                } else {
                    System.out.println("puertas traseras cerradas");
                }
            }else{
                System.out.println("puertas traseras trancadas");
            }
        }
    public void isPuertasdelanterasabiertas(){
        if (!carroceria.isPuertasTrancadas()) {
        if (carroceria.isPuertasDelanterasAbiertas()){
            System.out.println("Puertas delanteras abiertas");

        } else{System.out.println("puertas delateras cerradas");}
        } else{System.out.println("puertas delateras trancadas");}
    }
    public void isMaleteroAbierto(){
            if (!carroceria.isPuertasTrancadas()) {

                if (carroceria.isMaleteroAbierto()) {

                    System.out.println("maletero abierto");
                } else {
                    System.out.println("maletero cerrado");
                }
            }else{System.out.println("maletero trancado");}
    }
    //accesorios
    public void isAireAcondicionado(){

        if (accesorios.isAireAcondicionadoEncendido()){
            System.out.println("aire acondicionado encendido");

        } else{System.out.println("aire acondicionado apagado");}

    }
    public void isCalefaccion(){

        if (accesorios.isCalefaccionEncendida()){
            System.out.println("calefaccion encendido");

        } else{System.out.println("calefaccion apagado");}

    }

    public void isPuertasTrancadas(){

        if (accesorios.isCalefaccionEncendida()){
            System.out.println("calefaccion encendida");

        } else{System.out.println("calefaccion apagada");}

    }
    public void isRadio(){

        if (accesorios.isRadioEncendido()){
            System.out.println("Radio encendida");

        } else{System.out.println("Radio apagada");}

    }


    }




