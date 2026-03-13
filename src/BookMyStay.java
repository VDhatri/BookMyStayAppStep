public class BookMyStay {

    public static abstract class Room {
        protected int numberOfBeds;
        protected int squareFeet;
        protected double pricePerNight;

        public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
            this.numberOfBeds = numberOfBeds;
            this.squareFeet = squareFeet;
            this.pricePerNight = pricePerNight;
        }

        public void displayRoomDetails() {
            System.out.println("No of beds : " + numberOfBeds);
            System.out.println("Square feet : " + squareFeet);
            System.out.println("Price per night : " + pricePerNight);
        }
    }

    public static class SingleRoom extends Room {
        public SingleRoom() {
            super(1, 250, 1500.0);
        }
    }

    public static class DoubleRoom extends Room {
        public DoubleRoom() {
            super(2, 400, 2500.0);
        }
    }

    public static class SuiteRoom extends Room {
        public SuiteRoom() {
            super(3, 750, 5000.0);
        }
    }

    public static void main(String[] args) {

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        int singleAvailable = 10;
        int doubleAvailable = 5;
        int suiteAvailable = 2;

        System.out.println("Single Room");
        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailable);

        System.out.println();

        System.out.println("Double Room");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable);

        System.out.println();

        System.out.println("Suite Room");
        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}
