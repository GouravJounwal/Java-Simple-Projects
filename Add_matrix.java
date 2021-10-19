package com.company;

/*public class Add_Matrix {
    static void add(int [][] mat1,int mat2 [][]){
        int [][] res=new int[3][3];
        int i=0,j=0;
        for ( i=0;i<mat1.length;i++){//row num time
            for ( j= 0;j<mat1[i].length;j++){ // /coloum num of time
                res [i][j]= mat1[i][j]+mat2[i][j];
                System.out.println("the sum of matrix is"+res[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int i=0,j=0;
        int [][] matrix1= {{12,10,2},{13,9,8}};
        int [][] matrix2= {{11,1,4},{3,5,7}};
        add(matrix1[][],matrix2[][]);*/

        public class Add_Matrix{
            public static void main(String[] args) {
                int [][] mat1= {{12,10,2},{13,9,8}};
                int [][] mat2= {{11,1,4},{3,5,7}};
                int [][] res=new int[2][3];
                for ( int i=0;i<mat1.length;i++){//row num time
                    for ( int j= 0;j<mat1[i].length;j++){ // /coloum num of time
                        res [i][j]= mat1[i][j]+mat2[i][j];
                        System.out.print(res[i][j]+" ");
                    }
                    System.out.println();
                }
            }
        }
