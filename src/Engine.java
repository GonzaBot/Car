public class Engine {
    private boolean funcionaInyeccion = true;
    private boolean encendido=true;
    private boolean motorOk = true;



    public boolean pruebaInyeccion() {

        return funcionaInyeccion;
    }

    public boolean encender() {

        return encendido=true;
    }
    public boolean isEncendido() {

        if (encendido){
            return true;
        }else {
            return false;
        }
    }

    public boolean apagar() {
        this.encendido= false;
        return false;
        //System.out.println("Motor apagado.");
    }



    public boolean verificarMotor() {
        if (motorOk ) {
return true;

            // System.out.println("Estado del motor: OK");
        }else {
        return false;}
    }
    //parte de las ventanas

}
