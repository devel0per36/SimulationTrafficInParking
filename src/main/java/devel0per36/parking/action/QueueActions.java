package devel0per36.parking.action;

import devel0per36.parking.entity.Car;

/**
 * Интерфейс для описания действий очереди автомобилей
 * @version 1.0
 */
public interface QueueActions {
    /**
     * Метод для добавления автомобиля в очередь
     * @param car - автомобиль
     * @return результат добавления автомобиля в очередь
     */
    boolean addInQueue(Car car);
    /**
     * Метод для досрочного выхода автомобиля из очереди
     * @param car - автомобиль
     * @return результат удаления автомобиля из очереди
     */
    boolean exitFromQueue(Car car);
    /**
     * Метод для получения следующего автомобиля из очереди
     * @return результат получение следующего автомобиля из очереди
     */
    Car pullCar();
    /**
     * Метод для проверки на пустоту очереди
     * @return результат пустоты очереди
     */
    boolean isEmptyQueue();
    /**
     * Метод для проверки автомобиля в очереди
     * @param car - автомобиль
     * @return результат нахождения автомобиля в очереди
     */
    boolean checkingCarInTheQueue(Car car);
    /**
     * Метод для возврата количества элементов в очереди
     * @return количество элементов в очереди
     */
    int size();
}
