package mummiValeObjects;

import enums.Type;

public abstract class MummiValeObject {

    private final Type type = Type.OBJECT;

    public Type getType() {
        return type;
    }
}
