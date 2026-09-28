package src.main.java.delivery;

/**
 * Модуль 8. ОТЗЫВЫ И РЕЙТИНГ.
 * Отзыв i: ресторан DeliveryData.reviewRestaurant[i], оценка DeliveryData.reviewStars[i] (1..5).
 */
public class Reviews {

    // ================= Задачи на пару =================

    /** Средняя оценка ресторана (double). Если отзывов нет — 0. */
    public static double averageRating(int restaurantId) {
        // TODO
        return 0;
    }

    /** Сколько у ресторана отзывов с оценкой stars. */
    public static int countByStars(int restaurantId, int stars) {
        // TODO
        return 0;
    }

    /**
     * Ресторан с лучшей средней оценкой среди тех, у кого МИНИМУМ 3 отзыва.
     * При равенстве — меньший индекс. Если таких нет — -1.
     */
    public static int bestRestaurant() {
        // TODO
        return -1;
    }

    // ================= Уровень B =================

    /**
     * Медиана оценок ресторана. Собери оценки в отдельный массив, отсортируй сам (без Arrays.sort).
     * Для чётного количества — среднее двух средних элементов. Нет отзывов — 0.
     */
    public static double medianRating(int restaurantId) {
        // TODO
        return 0;
    }

    // ================= Домашка: интеграция (напарник — модуль Menu) =================

    /**
     * Название самого дешёвого блюда в лучшем ресторане.
     * Используй свой bestRestaurant() и Menu.cheapestInRestaurant(...) напарника.
     */
    public static String cheapestDishInBestRestaurant() {
        // TODO
        return "";
    }

    public static void main(String[] args) {
        System.out.println("--- Задачи на пару ---");
        Check.eq("averageRating(0)", averageRating(0), 4.4);
        Check.eq("averageRating(3)", averageRating(3), 3.5);
        Check.eq("averageRating(1)", averageRating(1), 4.17);
        Check.eq("countByStars(1, 5)", countByStars(1, 5), 4);
        Check.eq("countByStars(3, 4)", countByStars(3, 4), 0);
        Check.eq("bestRestaurant()", bestRestaurant(), 0);

        System.out.println("--- Уровень B ---");
        Check.eq("medianRating(1)", medianRating(1), 5.0);
        Check.eq("medianRating(2)", medianRating(2), 4.0);
        Check.eq("medianRating(4)", medianRating(4), 4.0);

        System.out.println("--- Интеграция (заработает после merge ветки напарника) ---");
        Check.eq("cheapestDishInBestRestaurant()", cheapestDishInBestRestaurant(), "Морс клюквенный");
    }
}
