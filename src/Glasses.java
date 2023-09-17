public class Glasses {

        private boolean ventanasSubidas;
        private boolean ventanasBajadas;

        public Glasses() {
            this.ventanasSubidas = true;
            this.ventanasBajadas = false;
        }

        public boolean VentanasSubidas() {
            return ventanasSubidas;
        }

        public void subirVentanas() {
            if (!ventanasSubidas) {
                ventanasSubidas = true;
                ventanasBajadas = false;
                System.out.println("Las ventanas han sido subidas.");

            } else {
                System.out.println("Las ventanas ya están subidas.");
            }
        }

        public boolean VentanasBajadas() {
            return ventanasBajadas;
        }

        public void bajarVentanas() {
            if (!ventanasBajadas) {
                ventanasBajadas = true;
                ventanasSubidas = false;
                System.out.println("Las ventanas han sido bajadas.");
            } else {
                System.out.println("Las ventanas ya están bajadas.");
            }
        }
    }


