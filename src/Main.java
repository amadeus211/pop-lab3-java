
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int storageSize = 10;
        int itemNumbers = 40;
        main.starter(storageSize, itemNumbers);
    }

    private void starter(int storageSize, int itemNumbers) {
        Manager manager = new Manager(storageSize);
        int item = 0;
        int i = 0;

        while (item < itemNumbers && i < 20) {
            int elements_to_add = Math.min(itemNumbers - item, (int) (Math.random() * storageSize) + 1);
            new Producer(elements_to_add, manager, i);
            new Consumer(elements_to_add, manager, i);
            item += elements_to_add;
            i++;
        }
    }
}