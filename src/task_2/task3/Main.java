package task_2.task3;

import task_2.task3.assembly_line.AssemblyLine;
import task_2.task3.assembly_line.line_step.LineStepEngine;
import task_2.task3.assembly_line.line_step.LineStepHousing;
import task_2.task3.assembly_line.line_step.LineStepTower;
import task_2.task3.tank.Tank;

public class Main {

    public static void main(String[] args) {
        AssemblyLine assemblyLine =
                new AssemblyLine(new LineStepHousing(), new LineStepEngine(), new LineStepTower());

        System.out.println("==================================");

        assemblyLine.assembleProduct(new Tank("танк 1"));

        System.out.println("==================================");

        assemblyLine.assembleProduct(new Tank("танк 2"));
    }

}
