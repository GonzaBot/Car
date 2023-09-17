public class Tires {

        private Integer tire1;
        private Integer tire2;
        private Integer tire3;
        private Integer tire4;

        public Tires(Integer tire1, Integer tire2, Integer tire3, Integer tire4) {
            this.tire1 = tire1;
            this.tire2 = tire2;
            this.tire3 = tire3;
            this.tire4 = tire4;
        }

        public Integer getTire1() {
            return tire1;
        }

        public void setTire1(Integer tire1) {
            this.tire1 = tire1;
        }

        public Integer getTire2() {
            return tire2;
        }

        public void setTire2(Integer tire2) {
            this.tire2 = tire2;
        }

        public Integer getTire3() {
            return tire3;
        }

        public void setTire3(Integer tire3) {
            this.tire3 = tire3;
        }

        public Integer getTire4() {
            return tire4;
        }

        public void setTire4(Integer tire4) {
            this.tire4 = tire4;
        }

        public int calculatePressure() {
            int total = tire1 + tire2 + tire3 + tire4;

            if (this.tire1 < 25) {
                return 11;
            }

             if (this.tire2 < 25) {
                return 22;
            }

             if (this.tire3 < 25) {
                return 33;
            }

            if (this.tire4 < 25) {
                return 44;
            }
             if (total > 400) {
                return 4;
            }

                if (total < 400 && total > 300) {
                    return 3;
                }

                if (total < 300 && total > 200) {
                    return 2;
                }

                if (total < 200 && total > 100) {
                    return 1;
                }

return 0;

        }


    }


