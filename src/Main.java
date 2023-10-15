import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1 () {
        int year = 2021;
        checkLeapYear(year);
    }


    public static void checkLeapYear(int year) {
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    public static void task2 (){
        int osType = 0; // 0 — iOS, 1 — Android
        int deviceYear = 2018; // год выпуска устройства
        setAppVersion(osType, deviceYear);
    }

    public static void setAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (deviceYear > currentYear) {
            System.out.println("Установите облегченную версию приложения для " + (osType == 0 ? "iOS" : "Android"));
        } else {
            System.out.println("Установите обычную версию приложения для " + (osType == 0 ? "iOS" : "Android"));
        }
    }

    public static void task3 (){
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1; // если расстояние больше 100 км, доставка невозможна
        }
    }

}