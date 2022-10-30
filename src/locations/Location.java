package locations;

import enums.Type;
import mummiValeObjects.ValeObject;

import java.util.ArrayList;

public abstract class Location {

    private final Type type = Type.LOCATION;

    public Type getType() {
        return type;
    }


    // list contains all locations that are added on main location
    private ArrayList<Location> locations = new ArrayList<>();

    public void addLocation(Location location) {
        locations.add(location);
    }

    /**
     * removes from the list all objects that have simple the same class with the argument
     */
    public void removeLocation(Location object) {
        int i = 0;
        while (i < locations.size()) {
            if (locations.get(i).getClass() == object.getClass()) {
                locations.remove(i);
            } else {
                i++;
            }
        }
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }


    // list contains all objects that are added on vale
    private ArrayList<ValeObject> valeObjects = new ArrayList<>();

    public void addValeObject(ValeObject object) {
        valeObjects.add(object);
    }

    /**
     * removes from the list all objects that have simple the same class with the argument
     */
    public void removeValeObject(ValeObject object) {
        int i = 0;
        while (i < valeObjects.size()) {
            if (valeObjects.get(i).getClass() == object.getClass()) {
                valeObjects.remove(i);
            } else {
                i++;
            }
        }
    }

    public ArrayList<ValeObject> getValeObjects() {
        return valeObjects;
    }


    private String name = "локация";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
