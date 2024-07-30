// Product class
class House {
    private String foundation;
    private String walls;
    private String roof;
    private String windows;
    private String doors;

    // Nested Builder class
    public static class Builder {
        private String foundation;
        private String walls;
        private String roof;
        private String windows;
        private String doors;

        // Builder methods
        public Builder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public Builder setWalls(String walls) {
            this.walls = walls;
            return this;
        }

        public Builder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public Builder setWindows(String windows) {
            this.windows = windows;
            return this;
        }

        public Builder setDoors(String doors) {
            this.doors = doors;
            return this;
        }

        // Build method
        public House build() {
            House house = new House();
            house.foundation = this.foundation;
            house.walls = this.walls;
            house.roof = this.roof;
            house.windows = this.windows;
            house.doors = this.doors;
            return house;
        }
    }

    // Display method to show the built house
    public void showDetails() {
        System.out.println("House with: ");
        System.out.println("Foundation: " + foundation);
        System.out.println("Walls: " + walls);
        System.out.println("Roof: " + roof);
        System.out.println("Windows: " + windows);
        System.out.println("Doors: " + doors);
    }
}

// Usage
public class Builder {
    public static void main(String[] args) {
        // Using the Builder to create a House object
        House house = new House.Builder()
            .setFoundation("Concrete Foundation")
            .setWalls("Brick Walls")
            .setRoof("Shingle Roof")
            .setWindows("Double Glazed Windows")
            .setDoors("Wooden Doors")
            .build();

        house.showDetails();
    }
}