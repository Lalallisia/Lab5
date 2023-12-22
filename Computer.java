class Computer extends Device {
    public Computer(int id, String brand) {
        super(id, brand);
    }

    // Реалізація абстрактного методу
    @Override
    public String getInfo() {
        return "ID: " + id + ", Brand: " + brand;
    }
}