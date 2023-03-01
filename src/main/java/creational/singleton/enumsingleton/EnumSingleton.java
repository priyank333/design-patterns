package creational.singleton.enumsingleton;

public enum EnumSingleton {
    INSTANCE;

    private int value;

    EnumSingleton() {
        value = 10;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
