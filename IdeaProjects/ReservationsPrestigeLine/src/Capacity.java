public class Capacity {

    private String capacityPlace;

    public Capacity(String capacityPlace) {

        this.capacityPlace = capacityPlace;

    }

    public String getCapacityPlace() {

        return capacityPlace;

    }

    public void setCapacityPlace( String capacityPlace ) {

        this.capacityPlace = capacityPlace;

    }

    @Override
    public String toString() {

        return "Place " + capacityPlace + "/4";
        // because each car has only capacity for 4 passenger places

    }



}


