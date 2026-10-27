// package LEC18 27 Oct26;
class RowAdder extends Thread
{
    int[][] a,b,c;
    int row;

    public RowAdder(int[][] a, int[][] b, int[][] c, int row)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        this.row=row;
    }

    public void run()
    {
        //add only one row and put answer in c
        Thread thread=Thread.currentThread();
        thread.setPriority(6);
        thread.setName("Thread"+ row);
        System.out.println(getName() + " thread is running with priority "+ getPriority());
        System.out.println();
        for(int j=0; j<4; j++)
        {       
            c[row][j]=a[row][j]+b[row][j];
        }
    }
}
public class MatrixMultiplyThreads {
    public static void main(String[] args) {
        Thread mainThread=Thread.currentThread();
        System.out.println(mainThread); 
    }
}
