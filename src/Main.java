public class Main {
    public static void main(String[] args) {
        // Вызов метода с различными входными данными
        System.out.println(ageAndTemperature(25, 15));
        System.out.println(ageAndTemperature(18, 20));
        System.out.println(ageAndTemperature(30, 35));
        System.out.println(ageAndTemperature(50, -5));
        System.out.println(ageAndTemperature(22, 32));
    }

    public static String ageAndTemperature(int age, int temperature) {
        if ((age > 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return "Можно идти гулять";
        } else if (age < 20 && (temperature >= 0 && temperature <= 28)) {
            return "Можно идти гулять";
        } else if (age > 45 && (temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}