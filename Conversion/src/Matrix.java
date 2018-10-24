import java.util.Scanner;

public class Matrix{
    public int determinant(int A[][],int N)
    {

        int det=0;
        if(N == 1)
        {
            det = A[0][0];
        }
        else if (N == 2)
        {
            det = A[0][0]*A[1][1] - A[1][0]*A[0][1];
        }
        else
        {
            det=0;
            for(int j1=0;j1<N;j1++)
            {
                int[][] m = new int[N-1][];
                for(int k=0;k<(N-1);k++)
                {
                    m[k] = new int[N-1];
                }
                for(int i=1;i<N;i++)
                {
                    int j2=0;
                    for(int j=0;j<N;j++)
                    {
                        if(j == j1)
                            continue;
                        m[i-1][j2] = A[i][j];
                        j2++;
                    }
                }
                det += Math.pow(-1.0,1.0+j1+1.0)* A[0][j1] * determinant(m,N-1);
            }
        }
        return det;
    }
    static int[][] remove(int n,int b,int c,int a[][])
    {
        int k[][]=new int[n-1][n-1];
        int l=0;
        int m=0;
       for (int i = 0; i < n; i++) {
            if(i==b)
            {
            continue ;
            }
            else
            {
            for (int j = 0; j < n; j++) {
            if(j==c){
            continue;
            }
            else
            {
                k[l][m]=a[i][j];
                m++;
                if(m>=n-1)
                {
                    break;
                }
            }
            }
            l++;
            if(l>=n-1)
            {
                break;
            }
            System.out.println();
}
    }
        return k;
    }
    public static void main(String[] args)
    {
        Matrix m=new Matrix();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int a=sc.nextInt();
        System.out.println("Enter number of columns");
        int b=sc.nextInt();
        if(a==b) {
            int arr1[][] = new int[a][b];
            int arr2[][] = new int[a][b];
            int addition[][] = new int[a][b];
            int multiplication[][] = new int[a][b];
            int cofactor1[][] = new int[a][b];
            System.out.println("Enter first matrix elements");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    arr1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter second matrix elements");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    arr2[i][j] = sc.nextInt();
                }
            }
            System.out.println("First matrix is ");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(arr1[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Second matrix is ");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(arr2[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Addition of matrices is");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    addition[i][j] = arr1[i][j] + arr2[i][j];
                    System.out.print(addition[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Multiplication of matrices are");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    multiplication[i][j]=0;
                    for (int k = 0; k < a; k++) {
                        multiplication[i][j]  = multiplication[i][j]+arr1[i][k] * arr2[k][j];
                    }
                        System.out.print(multiplication[i][j] + " ");
                    }
                    System.out.println();
                }
            int c=m.determinant(arr1,a);
            System.out.println("Determinant of first matrix is "+c);
            System.out.println("Cofactor of first matrix is");
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    int d[][]=Matrix.remove(a,i,j,arr1);
                    int e=m.determinant(d,a-1);
                    cofactor1[i][j]=(int)(Math.pow(-1,i+j))*e;
                    System.out.print(cofactor1[i][j]+" ");
                }
                System.out.println();
            }
            }
        else
        {
            System.out.println("Square matrix is needed i.e rows=columns but");
            System.out.println("number of rows is not equal to number of columns");
        }
    }
}