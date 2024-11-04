import javax.swing.JOptionPane;

public class home {
    public static void main(String[] args) {
        // Declare a 2D array
        int[][] array = {{1, 2, 3}, {4, 3, 6}, {3, 8, 9}};

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

        // Find all occurrences of the searched value
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == value) {
                    found = true;

                    // Replace the value at the found index with a new value
                    String newValue = JOptionPane.showInputDialog("Enter a new value:");
                    int newValueInt = Integer.parseInt(newValue);
                    array[i][j] = newValueInt;
                }
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "Value not found in the array.");
        } else {
            // Display the updated array
            System.out.println("Updated Array:");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}