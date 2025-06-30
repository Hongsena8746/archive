package cars;

abstract class Car {
    abstract void changeEngineOil();
}


class Audi extends Car {
    @Override
    void changeEngineOil() {
        System.out.println("Audi 엔진 오일을 교환해주세요");
    }
}

class Benz extends Car {
    @Override
    void changeEngineOil() {
        System.out.println("Benz 엔진 오일을 교환해주세요");
    }
}

class BMW extends Car {
    @Override
    void changeEngineOil() {
        System.out.println("BMW 엔진 오일을 교환해주세요");
    }
}

