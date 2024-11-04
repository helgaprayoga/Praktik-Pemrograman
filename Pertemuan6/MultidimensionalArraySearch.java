import javax.swing.JOptionPane;

public class MultidimensionalArraySearch {
    public static void main(String[] args) {
        // Declare a 2D array
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Display the array
        System.out.println("Original Array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Search for a value
        String searchValue = JOptionPane.showInputDialog("Enter a value to search:");
        int value = Integer.parseInt(searchValue);

        // Find the index position of the searched value
        int rowIndex = -1;
        int colIndex = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == value) {
                    rowIndex = i;
                    colIndex = j;
                    break;
                }
            }
        }

        if (rowIndex != -1 && colIndex != -1) {
            // Replace the value at the found index with a new value
            String newValue = JOptionPane.showInputDialog("Enter a new value:");
            int newValueInt = Integer.parseInt(newValue);
            array[rowIndex][colIndex] = newValueInt;

            // Display the updated array
            System.out.println("Updated Array:");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Value not found in the array.");
        }
    }
}