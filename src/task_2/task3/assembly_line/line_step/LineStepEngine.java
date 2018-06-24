package task_2.task3.assembly_line.line_step;

import task_2.task3.tank.part.Engine;
import task_2.task3.tank.part.IProductPart;

public class LineStepEngine implements ILineStep {

    public LineStepEngine() {
        printInfo();
    }

    @Override
    public IProductPart buildProductPart() {
        IProductPart engine = new Engine();
        printInfoBuildProduct(engine);
        return engine;
    }

    private void printInfo(){
        System.out.println("Создан участок производства деталей - тип: \"Двигатель\"");
    }

    private void printInfoBuildProduct(IProductPart iProductPart){
        System.out.println("Получаем деталь: " + iProductPart.getClass().getSimpleName());
    }

}
