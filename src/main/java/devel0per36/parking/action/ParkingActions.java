package devel0per36.parking.action;

import devel0per36.parking.entity.Car;

/**
 * Интерфейс для описания действий автостоянки
 * @version 1.0
 */
public interface ParkingActions {
    /**
     * Метод для организации приезда автомобиля
     * @param car - автомобиль
     * @return результат парковки автомобиля на автостоянке
     */
    boolean arrivalOfCar(Car car);
    /**
     * Метод для организации отъезда автомобиля
     * @param number - номер парковочного места
     */
    void departureOfCar(int number);
    /**
     * Метод позволяющий выйти из очереди ожидания досрочно
     * @param car - автомобиль
     * @return результат действия "выйти из очереди"
     */
    boolean exitQueue(Car car);
}
