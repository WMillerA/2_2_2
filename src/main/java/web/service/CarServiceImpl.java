package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    List<Car> carList = new ArrayList<>();

    public CarServiceImpl() {
        carList.add(new Car("Tesla", "3", "electro"));
        carList.add(new Car("VW", "Passat", "diesel"));
        carList.add(new Car("BMW", "5", "diesel"));
        carList.add(new Car("Lada", "Vesta", "gasoline"));
        carList.add(new Car("Kia", "Rio", "gasoline"));
    }
    @Override
    public List<Car> getCarList(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
