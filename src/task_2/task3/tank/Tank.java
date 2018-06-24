package task_2.task3.tank;

import task_2.task3.tank.part.IProductPart;

public class Tank implements IProduct {

    private String name;

    private IProductPart housing;
    private IProductPart engine;
    private IProductPart tower;

    public Tank(String name) {
        this.name = name;
        System.out.println("Производство нового продукта");
        System.out.println("тип: " + getClass().getSimpleName() + " наименование: " + name);
    }

    @Override
    public void instalFirstPart(IProductPart housing) {
        printInfo(housing);
        this.housing = housing;
    }

    @Override
    public void instalSecondPart(IProductPart engine) {
        printInfo(engine);
        this.engine = engine;
    }

    @Override
    public void instalThirdPart(IProductPart tower) {
        printInfo(tower);
        this.tower = tower;
    }

    private void printInfo(IProductPart iProductPart){
        System.out.println("Шаг сборочной линии: установка детали - " + iProductPart.getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public IProductPart getHousing() {
        return housing;
    }

    public IProductPart getEngine() {
        return engine;
    }

    public IProductPart getTower() {
        return tower;
    }
}
