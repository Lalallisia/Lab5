abstract class Device {
    protected int id;
    protected String brand;

    public Device(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    // Абстрактний метод, який повинен бути реалізований в підкласах
    public abstract String getInfo();
}
