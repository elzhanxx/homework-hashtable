package Homework3;

import java.util.ArrayList;
import java.util.HashMap;

public class OrdersManager {
    HashMap<String, ArrayList<Double>> customersOrders;

    public OrdersManager() {
        customersOrders = new HashMap<>();
        ArrayList<Double> orders = new ArrayList<>();
        orders.add(154.43);
        orders.add(5453.98);
        orders.add(8776.65);
        customersOrders.put("Иван И.", orders);

        orders = new ArrayList<>();
        orders.add(25343.54);
        orders.add(420.50);
        customersOrders.put("Ольга С.", orders);

        orders = new ArrayList<>();
        orders.add(325.90);
        customersOrders.put("Александр Т.", orders);

        orders = new ArrayList<>();
        orders.add(253.54);
        orders.add(420.50);
        customersOrders.put("Александр Р.", orders);

        orders = new ArrayList<>();
        orders.add(780.54);
        orders.add(420.50);
        orders.add(36343.54);
        orders.add(2000.50);
        customersOrders.put("Екатерина О.", orders);
    }

    void printAllOrders() {
        for (String name : customersOrders.keySet()) { // Цикл должен пройтись по ключам
            System.out.println("Заказы " + name + ":");
            ArrayList<Double> value = customersOrders.get(name);
            System.out.println(value);
        }
    }

    double getOrdersSum() {
        double sum = 0;
        for (ArrayList<Double> orders : customersOrders.values()) { // Здесь должен быть обход по значениям
            for (double orderPrice : orders) {
                sum += orderPrice;
            }
        }
        return sum;
    }

    void printCustomerOrders(String customerName) {
        if (customerName != null) { // Проверьте, есть ли указанный ключ в таблице
            System.out.println("Заказы " + customerName + ":");
            System.out.println(customersOrders.get(customerName));
        }
    }

    String getMaxOrderCustomerName() {
        double maxOrder = 0;
        String customerName = "";

        for (String key : customersOrders.keySet()) {
            for (double value : customersOrders.get(key)) {
                if (value > maxOrder) {
                    maxOrder = value;
                    customerName = key;
                }
            }

        }
        return customerName;
    }
        void removeUnprofitableOrders () {
            ArrayList<String> names = new ArrayList<>(); // Создайте список клиентов с заказами меньше 5000

            // Наполните список names
            for (String key : customersOrders.keySet()) {
                double ordersSum = 0;
                for (double value : customersOrders.get(key)) {
                    ordersSum += value;
                }
                if (ordersSum < 5000) {
                    names.add(key);
                }
            }
            for (String key : names) {
                customersOrders.remove(key);
                System.out.println("Клиента " + key + " больше нет в таблице.");
            }
        }
    }
