class Army {

    public static void createArmy() {
        // Implement this method
        Unit one=new Unit("alex");
        Unit one1=new Unit("balex");
        Unit one2=new Unit("calex");
        Unit one3=new Unit("dalex");
        Unit one4=new Unit("ealex");
        Knight two=new Knight("Rohan");
        Knight two1=new Knight("BRohan");
        Knight two2=new Knight("CRohan");
        General three=new General("Paul");
        Doctor four=new Doctor("kay");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}