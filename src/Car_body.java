public class Car_body {

        private boolean puertasTrancadas;
        private boolean puertasDelanterasAbiertas;
        private boolean puertasTraserasAbiertas;
        private boolean capoAbierto;
        private boolean maleteroAbierto;

        public Car_body() {
            this.puertasTrancadas = true;
            this.puertasDelanterasAbiertas = false;
            this.puertasTraserasAbiertas = false;
            this.capoAbierto = false;
            this.maleteroAbierto = false;
        }

        public void trancarPuertas() {
            puertasTrancadas = true;
        }

        public void destrancarPuertas() {
            puertasTrancadas = false;
        }

        public void abrirPuertasDelanteras() {
            puertasDelanterasAbiertas = true;
        }

        public void cerrarPuertasDelanteras() {
            puertasDelanterasAbiertas = false;
        }

        public boolean isPuertasTrancadas() {
            return puertasTrancadas;
        }

        public boolean isPuertasDelanterasAbiertas() {
            return puertasDelanterasAbiertas;
        }

        public boolean abrirPuertasTraseras() {
            puertasTraserasAbiertas = true;
            return true;
        }

        public boolean cerrarPuertasTraseras() {
            puertasTraserasAbiertas = false;
            return true;
        }

        public boolean isPuertaTraseraAbierta() {
            return puertasTraserasAbiertas;
        }

        public boolean abrirCapo() {
            capoAbierto = true;
            return true;
        }

        public boolean cerrarCapo() {
            capoAbierto = false;
            return true;
        }

        public boolean isCapoAbierto() {
            return capoAbierto;
        }

        public boolean abrirMaletero() {
            maleteroAbierto = true;
            return true;
        }

        public boolean cerrarMaletero() {
            maleteroAbierto = false;
            return true;
        }

        public boolean isMaleteroAbierto() {
            return maleteroAbierto;
        }
    }




