import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(float temperature);
}

class PhoneDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Phone display updated: Temperature is " + temperature);
    }
}

class WeatherDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Weather display updated: Temperature is " + temperature);
    }
}

interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        WeatherDisplay weatherDisplay = new WeatherDisplay();

        station.addObserver(phoneDisplay);
        station.addObserver(weatherDisplay);

        station.setTemperature(30.0f); // Both displays receive the update
        station.setTemperature(25.0f); // Both displays receive the update
    }
}