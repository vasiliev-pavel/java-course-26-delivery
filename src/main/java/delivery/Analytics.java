package src.main.java.delivery;

/**
 * Модуль 9. АНАЛИТИКА.
 * Заказ i за день: час DeliveryData.orderHour[i], сумма orderTotal[i],
 * клиент orderClient[i], ресторан orderRestaurant[i].
 */
public class Analytics {

    // ================= Задачи на пару =================

    /** Выручка за день в копейках. */
    public static int totalRevenue() {
        // TODO
        return 0;
    }

    /** Средний чек в копейках (double). */
    public static double averageCheck() {
        // TODO
        return 0;
    }

    /**
     * Пиковый час — час, в который было больше всего заказов.
     * Заведи массив на 24 ячейки и посчитай заказы по часам. При равенстве — более ранний час.
     */
    public static int peakHour() {
        // TODO
        return 0;
    }

    /** Выручка одного ресторана за день. */
    public static int revenueByRestaurant(int restaurantId) {
        // TODO
        return 0;
    }

    // ================= Уровень B =================

    /** Сколько клиентов сделали 2 и больше заказов за день. */
    public static int repeatClients() {
        // TODO
        return 0;
    }

    // ================= Домашка: интеграция (напарник — модуль Reviews) =================

    /** Выручка ресторана с лучшим рейтингом. Используй Reviews.bestRestaurant() напарника. */
    public static int revenueOfBestRestaurant() {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("--- Задачи на пару ---");
        Check.eq("totalRevenue()", totalRevenue(), 1482000);
        Check.eq("averageCheck()", averageCheck(), 74100.0);
        Check.eq("peakHour()", peakHour(), 19);
        Check.eq("revenueByRestaurant(2)", revenueByRestaurant(2), 539000);
        Check.eq("revenueByRestaurant(7)", revenueByRestaurant(7), 0);

        System.out.println("--- Уровень B ---");
        Check.eq("repeatClients()", repeatClients(), 5);

        System.out.println("--- Интеграция (заработает после merge ветки напарника) ---");
        Check.eq("revenueOfBestRestaurant()", revenueOfBestRestaurant(), 254000);
    }
}
