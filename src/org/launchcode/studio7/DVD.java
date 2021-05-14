package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    private String director;

    public DVD(String title, int storageCapacity, int rpm, String director) {
        super(title, storageCapacity, rpm);

        this.director = director;
    }

    @Override
    public void spinDisc() {
        System.out.println("Spinning DVD at " + this.getRpm());
    }

    @Override
    public void ejectDisc() {
        System.out.println("Ejecting your DVD now");
    }

    @Override
    public void storeData() {

    }

    @Override
    public void laserRead() {

    }

    @Override
    public void display() {

    }

    @Override
    public void format() {

    }

    @Override
    public String toString() {
        return "DVD{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                '}';
    }
// TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
