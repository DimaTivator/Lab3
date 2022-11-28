package abilities;

import exceptions.graphExceptions.FreePlaceNotFoundException;
import locations.Cave;

public interface AbleToDig {

    void dig(Cave cave) throws FreePlaceNotFoundException;
}
