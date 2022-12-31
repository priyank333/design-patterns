package creational.singleton.enumsingleton;

public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {
        value = 10;
    }

    private int value;
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
