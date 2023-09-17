public class Seat {


        private boolean calefactorAsientoEncendido;
        private boolean enfriadorAsientoEncendido;
        private boolean cinturonAbrochado;

        public boolean isCalefactorAsientoEncendido() {
            return calefactorAsientoEncendido;
        }

        public boolean encenderCalefactorAsiento() {
            calefactorAsientoEncendido = true;
            return true;
        }

        public boolean apagarCalefactorAsiento() {
            calefactorAsientoEncendido = false;
            return false;
        }

        public boolean isEnfriadorAsientoEncendido() {
            return enfriadorAsientoEncendido;
        }

        public void encenderEnfriadorAsiento() {
            enfriadorAsientoEncendido = true;
            System.out.println("Enfriador de asiento encendido.");
        }

        public void apagarEnfriadorAsiento() {
            enfriadorAsientoEncendido = false;
            System.out.println("Enfriador de asiento apagado.");
        }

        public boolean isCinturonAbrochado() {
            return cinturonAbrochado;
        }

        public Boolean abrocharCinturon() {
            cinturonAbrochado = true;
           return true;
        }

        public boolean desabrocharCinturon() {
            cinturonAbrochado = false;
            return false;
        }

        public boolean activarCalefaccionAsiento() {
            calefactorAsientoEncendido = true;
            return true;
           // System.out.println("Calefacción de asiento activada.");
        }

        public boolean activarEnfriamientoAsiento() {
            enfriadorAsientoEncendido = true;
            return true;
          //  System.out.println("Enfriamiento de asiento activado.");
        }

        public boolean apagarCalefaccionEnfriamientoAsiento() {
            calefactorAsientoEncendido = false;
            enfriadorAsientoEncendido = false;
            return true;
           // System.out.println("Calefacción y enfriamiento de asiento apagados.");
        }
    }


