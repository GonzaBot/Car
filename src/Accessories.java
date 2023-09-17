public class Accessories {

        private boolean radioEncendido;
        private boolean aireAcondicionadoEncendido;
        private boolean calefaccionEncendida;

        public Accessories() {
            //cada vez que prende el auto en si estan apagadas
            this.radioEncendido = false;
            this.aireAcondicionadoEncendido = false;
            this.calefaccionEncendida = false;
        }

        public boolean isRadioEncendido() {
            return radioEncendido;
        }

        public boolean encenderRadio() {
            radioEncendido = true;
            return true;
          //  System.out.println("Radio encendido.");
        }

        public boolean apagarRadio() {
            radioEncendido = false;
            return false;
           // System.out.println("Radio apagado.");
        }

        public boolean isAireAcondicionadoEncendido() {
            return aireAcondicionadoEncendido;
        }

        public boolean encenderAireAcondicionado() {
            aireAcondicionadoEncendido = true;
            return true;
           // System.out.println("Aire acondicionado encendido.");
        }

        public Boolean apagarAireAcondicionado() {
            aireAcondicionadoEncendido = false;
            return false;
           // System.out.println("Aire acondicionado apagado.");
        }

        public boolean isCalefaccionEncendida() {
            return calefaccionEncendida;
        }

        public boolean encenderCalefaccion() {
            calefaccionEncendida = true;
            return true;
            //System.out.println("Calefacción encendida.");
        }

        public boolean apagarCalefaccion() {
            calefaccionEncendida = false;
            return false;
           // System.out.println("Calefacción apagada.");
        }
    }


