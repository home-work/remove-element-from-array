import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Tạo mảng
        System.out.println("Nhập vào số phần tử của mảng:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1));
            array[i] = scanner.nextInt();
        }

        System.out.println("Mảng đã nhập:");
        for (int i = 0; i < size; i++) {
            System.out.printf(array[i] + "\t");
        }

        //Xóa phần tử của mảng
        System.out.println("\nPhần tử muốn xóa:");
        int valueRemoved = scanner.nextInt();
        int indexOfValue = 0;
        boolean existsElement = false;
        for (int i = 0; i < size; i++) {
            if (valueRemoved == array[i]) {
                existsElement = true;
                indexOfValue = i;
                break;
            }
        }

        if (existsElement) {
            System.out.println(valueRemoved + " có tồn tại trong mảng");
            System.out.println("Bạn có muốn xóa không(y/n)?");
            String answer = scanner.next();
            if (answer.equals("y")) {
                for (int i = 0; i < size - 1; i++) {
                    if (indexOfValue <= i) {
                        array[i] = array[i + 1];
                    }
                    System.out.printf(array[i] + "\t");
                }
            } else {
                System.exit(0);
            }
        } else {
            System.out.println(valueRemoved + " không tồn tại trong mảng");
            System.exit(0);
        }

    }
}
