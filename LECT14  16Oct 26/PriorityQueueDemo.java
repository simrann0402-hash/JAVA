// package LECT14  October 2026;

public class PriorityQueueDemo {
    
        // 0 0 0 1 0 0 1 0 
        // 0 0 1 1 1 0 1 0 
        // 0 0 0 1 1 0 1 1 
        // 0 0 0 1 1 0 1 0
        // 0 0 0 0 0 0 0 0
        // 0 0 0 0 0 0 1 1 
        // 0 0 0 0 0 0 0 0
        // 0 0 0 0 1 0 0 0
        // a student informs any passed information to left, right, front and back student
        // if i inform the student (1, 3), how many student will get the information?
        // 1 means student sitting, 0 means no student sitting there.
static int count = 0;

static void inform(int[][] a, int i, int j) {

    // Check boundary and whether student is present
    if (i < 0 || j < 0 || i >= a.length || j >= a[0].length || a[i][j] == 0) {
        return;
    }

    // Mark student as informed
    a[i][j] = 0;
    count++;

    // Inform left, right, up and down students
    inform(a, i, j - 1);
    inform(a, i, j + 1);
    inform(a, i - 1, j);
    inform(a, i + 1, j);
}

public static void main(String[] args) {

    int[][] a = {
        {0,0,0,1,0,0,1,0},
        {0,0,1,1,1,0,1,0},
        {0,0,0,1,1,0,1,1},
        {0,0,0,1,1,0,1,0},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,1,1},
        {0,0,0,0,0,0,0,0},
        {0,0,0,0,1,0,0,0}
    };

    inform(a, 1, 3);

    System.out.println("Students informed: " + count);
}

    
}