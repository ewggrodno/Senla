package task_2.task3.assembly_line.line_step;

import task_2.task3.tank.part.IProductPart;
import task_2.task3.tank.part.Tower;

public class LineStepTower implements ILineStep {

    public LineStepTower() {
        printInfo();
    }

    @Override
    public IProductPart buildProductPart() {
        IProductPart tower = new Tower();
        printInfoBuildProduct(tower);
        return tower;
    }


    private void printInfo() {
        System.out.println("Создан участок производства деталей - тип: \"Башня\"");
    }

    private void printInfoBuildProduct(IProductPart iProductPart){
        System.out.println("Получаем деталь: " + iProductPart.getClass().getSimpleName());
    }
}
