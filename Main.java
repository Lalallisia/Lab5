public class Main {
    public static void main(String[] args) {
        String cafeName = "JavaCafe";
        Computer regularComputer1 = new Computer(1, "Dell");
        GamingComputer gamingComputer1 = new GamingComputer(2, "Alienware", "NVIDIA RTX 3080");
        Laptop laptop1 = new Laptop(3, "Lenovo", "15 inches");

        Device[] devicesArray = { regularComputer1, gamingComputer1, laptop1 };

        InternetCafe cafe = new InternetCafe(cafeName, devicesArray);
        cafe.displayInfo();

        // Викликати функцію динамічної диспетчеризації для кожного об'єкта
        for (Device device : devicesArray) {
            MethodDispatcher.executeMethod(device);
        }
    }
}