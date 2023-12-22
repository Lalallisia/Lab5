class MethodDispatcher {
    // Динамічна диспетчеризація методів
    public static void executeMethod(Device device) {
        System.out.println("Executing methods for " + device.getClass().getSimpleName());
        System.out.println(device.getInfo()); // Викликаємо метод getInfo() в залежності від класу об'єкта
        if (device instanceof GamingComputer) {
            GamingComputer gamingComputer = (GamingComputer) device;
            // Додатковий код для GamingComputer, якщо потрібно
            System.out.println("Special method for GamingComputer");
        } else if (device instanceof Laptop) {
            Laptop laptop = (Laptop) device;
            // Додатковий код для Laptop, якщо потрібно
            System.out.println("Special method for Laptop");
        }
        System.out.println("------------------------------");
    }
}