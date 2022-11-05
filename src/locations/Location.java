package locations;

import enums.Type;
import mummiValeObjects.ValeObject;

import java.util.LinkedList;

public abstract class Location {

    private final Type type = Type.LOCATION;

    public Type getType() {
        return type;
    }


    // list contains all locations that are added on main location
    private LinkedList<Location> locations = new LinkedList<>();

    public void addLocation(Location location) {
        locations.add(location);
    }

    /**
     * removes from the list all objects that have the same class as the argument
     */
    public void removeLocation(Location object) {
        /* old version of the method
        int i = 0;
        while (i < locations.size()) {
            if (locations.get(i).getClass() == object.getClass()) {
                locations.remove(i);
            } else {
                i++;
            }
        }
        */
        locations.removeIf(location -> location.getClass() == object.getClass());
    }

    public LinkedList<Location> getLocations() {
        return locations;
    }


    // list contains all objects that are added on vale
    private LinkedList<ValeObject> valeObjects = new LinkedList<>();

    public void addValeObject(ValeObject object) {
        valeObjects.add(object);
    }

    /**
     * removes from the list all objects that have the same class as the argument
     */
    public void removeValeObject(ValeObject object) {
        /* old version of the method
        int i = 0;
        while (i < valeObjects.size()) {
            if (valeObjects.get(i).getClass() == object.getClass()) {
                valeObjects.remove(i);
            } else {
                i++;
            }
        }
         */
        valeObjects.removeIf(valeObject -> valeObject.getClass() == object.getClass());
    }

    public LinkedList<ValeObject> getValeObjects() {
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
