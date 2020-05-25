package pensje;

import org.junit.Test;

import java.io.File;
import java.net.URI;
import java.util.*;

import static org.junit.Assert.assertArrayEquals;

public class PensjeTest {

    Pensje pensje = new Pensje();


    @Test
    public void pen0() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen1a() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen1b() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen1c() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen1d() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen1e() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen1ocen() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen2a() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen2b() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen2c() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen2d() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen2e() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen2ocen() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen3a() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen3b() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen3ocen() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen4a() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen4b() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen4ocen() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen5a() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen5b() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen5ocen() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen6() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen7() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen8() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen9() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen10() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen11() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen12() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen13() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen14() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen15() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    public void pen16() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        List<Pensje.Worker> inputWorkers = getInput(methodName);
        int[] expectedOutput = getOutput(methodName, inputWorkers.size());
        int[] actualOutput = pensje.calculateSalary(inputWorkers);
        System.out.println("Test name: " + methodName);
        System.out.println("Expected output: " + Arrays.toString(Arrays.copyOfRange(expectedOutput, 0, Math.min(expectedOutput.length, 30))));
        System.out.println("Actual   output: " + Arrays.toString(Arrays.copyOfRange(actualOutput, 0, Math.min(actualOutput.length, 30))));
        assertArrayEquals(expectedOutput, actualOutput);
    }

    private static List<Pensje.Worker> getInput(String testName) {
        List<Pensje.Worker> workers = new ArrayList<>();
        try {
            URI uri = Thread.currentThread().getContextClassLoader().getResource(testName + ".in").toURI();
            File inFile = new File(uri);
            Scanner scanner = new Scanner(inFile);
            StringTokenizer input = new StringTokenizer(scanner.nextLine());
            int numberOfWorkers = Integer.parseInt(input.nextToken());
            for (int i = 1; i <= numberOfWorkers; i++) {
                input = new StringTokenizer(scanner.nextLine());
                Pensje.Worker worker = new Pensje.Worker();
                worker.number = i;
                worker.boss = Integer.parseInt(input.nextToken());
                worker.salary = Integer.parseInt(input.nextToken());
                if (worker.boss == i) {
                    worker.salary = numberOfWorkers;
                }
                workers.add(worker);
            }
        } catch (Exception e) {
        }
        return workers;
    }

    private static int[] getOutput(String testName, int numberOfWorkers) {
        int [] salaries = new int[numberOfWorkers];
        try {
            URI uri = Thread.currentThread().getContextClassLoader().getResource(testName + ".out").toURI();
            File inFile = new File(uri);
            Scanner scanner = new Scanner(inFile);
            for (int i = 0; i < numberOfWorkers; i++) {
                StringTokenizer input = new StringTokenizer(scanner.nextLine());
                salaries[i] = Integer.parseInt(input.nextToken());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return salaries;
    }
}