package ru.vsu.cs.kislova_i_v;

import org.junit.*;

public class Tests {
    @BeforeClass
    public static void reportAboutStartOfTests() {
        System.out.println("Testing of the program begins...");
        System.out.println();
    }

    @Before
    public void reportOnTestOperation() {
        System.out.println("Test is running...");
    }

    @Test
    public void testOnlyWithNegativeElements() throws LinkedList.LinkedListException {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(-51);
        list.addElementByIndex(1,-1);
        list.addElementByIndex(2, -10);
        list.addElementByIndex(3, -100);
        list.addElementByIndex(4, -9);
        list.addElementByIndex(5, -100001);
        list.addElementByIndex(6, -25);
        list.addLast(-16);

        System.out.print("Исходный список: ");
        Main.printList(list);

        list.checkAndRemoveEvenElements(list);

        System.out.print("Получившийся список: ");
        Main.printList(list);

        int[] array = new int[list.getSize()];

        for (int i = 0; i < list.getSize(); i++) {
            array[i] = list.getElementByIndex(i);
        }

        int[] arrayResult = {-51, -1, -9, -100001, -25};

        Assert.assertArrayEquals(array, arrayResult);
    }

    @Test
    public void testOnlyWithEvenElements() throws LinkedList.LinkedListException {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(-50);
        list.addElementByIndex(1,100);
        list.addElementByIndex(2, 4);
        list.addElementByIndex(3, 12020);
        list.addElementByIndex(4, 90);
        list.addElementByIndex(5, -10000);
        list.addElementByIndex(6, -26);
        list.addLast(-16);

        System.out.print("Исходный список: ");
        Main.printList(list);

        list.checkAndRemoveEvenElements(list);

        System.out.print("Получившийся список: ");
        Main.printList(list);

        int[] array = new int[list.getSize()];

        for (int i = 0; i < list.getSize(); i++) {
            array[i] = list.getElementByIndex(i);
        }

        int[] arrayResult = {};

        Assert.assertArrayEquals(array, arrayResult);
    }

    @Test
    public void testWhereOnlyZerosShouldRemain() throws LinkedList.LinkedListException {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(0);
        list.addElementByIndex(1,100);
        list.addElementByIndex(2, 0);
        list.addElementByIndex(3, 28);
        list.addElementByIndex(4, 84);
        list.addElementByIndex(5, 0);
        list.addElementByIndex(6, 0);
        list.addLast(-16);

        System.out.print("Исходный список: ");
        Main.printList(list);

        list.checkAndRemoveEvenElements(list);

        System.out.print("Получившийся список: ");
        Main.printList(list);

        int[] array = new int[list.getSize()];

        for (int i = 0; i < list.getSize(); i++) {
            array[i] = list.getElementByIndex(i);
        }

        int[] arrayResult = {0, 0, 0, 0};

        Assert.assertArrayEquals(array, arrayResult);
    }

    @Test
    public void testOnlyWithOddElements() throws LinkedList.LinkedListException {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(5);
        list.addElementByIndex(1,101);
        list.addElementByIndex(2, 507);
        list.addElementByIndex(3, 281);
        list.addElementByIndex(4, 847);
        list.addElementByIndex(5, 89);
        list.addElementByIndex(6, 7);
        list.addLast(-163);

        System.out.print("Исходный список: ");
        Main.printList(list);

        list.checkAndRemoveEvenElements(list);

        System.out.print("Получившийся список: ");
        Main.printList(list);

        int[] array = new int[list.getSize()];

        for (int i = 0; i < list.getSize(); i++) {
            array[i] = list.getElementByIndex(i);
        }

        int[] arrayResult = {5, 101, 507, 281, 847, 89, 7, -163};

        Assert.assertArrayEquals(array, arrayResult);
    }

    @After
    public void reportCompletionOfTest() {
        System.out.println("Test execution completed");
        System.out.println();
    }

    @AfterClass
    public static void reportAboutEndOfTests() {
        System.out.print("Testing of the program is completed");
        System.out.println();
    }
}
