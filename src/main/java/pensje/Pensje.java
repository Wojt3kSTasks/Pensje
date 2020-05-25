package pensje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Pensje {

    static class Worker {
        int number;
        int salary;
        int boss;
        int subordinate;
        int numberOfSubordinates;
        int numberOfSubordinatesLeftToCalculate;
    }

    public static void main(String[] args) {
        Pensje pensje = new Pensje();
        int[] salaries = pensje.calculateSalary(pensje.loadData());
        for (int salary : salaries) {
            System.out.println(salary);
        }
    }

    public List<Worker> loadData() {
        List<Worker> workers = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);
            StringTokenizer line = new StringTokenizer(scanner.nextLine());
            int numberOfWorkers = Integer.parseInt(line.nextToken());
            for (int i = 1; i <= numberOfWorkers; i++) {
                line = new StringTokenizer(scanner.nextLine());
                Worker worker = new Worker();
                worker.number = i;
                worker.boss = Integer.parseInt(line.nextToken());
                worker.salary = Integer.parseInt(line.nextToken());
                if (worker.boss == i) {
                    worker.salary = numberOfWorkers;
                }
                workers.add(worker);
            }
        } catch (Exception e) {
        }
        return workers;
    }

    public int[] calculateSalary(List<Worker> workers) {
        int numberOfWorkers = workers.size();
        int[] usedSalaries = new int[workers.size() + 1];
        List<Worker> workersLeftToCalculate = new ArrayList<>();
        for (Worker worker : workers) {
            workers.get(worker.boss - 1).numberOfSubordinatesLeftToCalculate++;
        }
        for (Worker worker : workers) {
            if (worker.numberOfSubordinatesLeftToCalculate == 0) {
                workersLeftToCalculate.add(worker);
            }
        }
        for (int i = 0; i < workersLeftToCalculate.size(); i++) {
            Worker worker = workersLeftToCalculate.get(i);
            if (worker.salary == 0) {
                Worker boss = workers.get(worker.boss - 1);
                boss.numberOfSubordinatesLeftToCalculate--;
                if (boss.numberOfSubordinatesLeftToCalculate == 0) {
                    workersLeftToCalculate.add(boss);
                }
                boss.numberOfSubordinates += worker.numberOfSubordinates + 1;
            }
        }
        for (Worker worker : workers) {
            if (worker.salary > 0) {
                usedSalaries[worker.salary] = worker.number;
            } else if (workers.get(worker.boss - 1).subordinate == 0) {
                workers.get(worker.boss - 1).subordinate = worker.number;
            } else {
                workers.get(worker.boss - 1).subordinate = -1;
            }
        }
        int i = 0;
        int numberOfFreeSalaries = 0;
        int numberOfPossibleSalaries = 0;
        while (i < numberOfWorkers) {
            while (i < numberOfWorkers && usedSalaries[i + 1] == 0) {
                i++;
                numberOfFreeSalaries++;
                numberOfPossibleSalaries++;
            }
            while (i < numberOfWorkers && usedSalaries[i + 1] > 0) {
                i++;
                Worker worker = workers.get(usedSalaries[i] - 1);
                int salary = i;
                numberOfFreeSalaries -= worker.numberOfSubordinates;
                if (numberOfFreeSalaries == 0) {
                    while (numberOfPossibleSalaries > 0 && worker.subordinate > 0) {
                        numberOfPossibleSalaries--;
                        while (usedSalaries[salary] > 0) {
                            salary--;
                        }
                        worker = workers.get(worker.subordinate - 1);
                        worker.salary = salary;
                        usedSalaries[salary] = worker.number;
                    }
                    numberOfPossibleSalaries = 0;
                }
                if (worker.numberOfSubordinates > 0) {
                    numberOfPossibleSalaries = 0;
                }
            }
        }
        return workers.stream().mapToInt(w -> w.salary).toArray();
    }
}