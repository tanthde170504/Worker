/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.Manager;
import Model.History;
import Model.Worker;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Worker> lw = new ArrayList<>();
        ArrayList<History> lh = new ArrayList<>();
        Manager manager = new Manager();
        while (true) {
            int choice = manager.menu();
            switch (choice) {
                case 1:
                    manager.addWorker(lw);
                    break;
                case 2:
                    manager.changeSalary(lw, lh, 1);
                    break;
                case 3:
                    manager.changeSalary(lw, lh, 2);
                    break;
                case 4:
                    manager.printListHistory(lh);
                    break;
                case 5:
                    return;
            }
        }
    }
}
