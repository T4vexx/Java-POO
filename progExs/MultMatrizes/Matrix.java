package progExs.MultMatrizes;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,aux;
        int[][] matriz1;
        int[][] matriz2;
        int[][] result;

        System.out.printf("\n====================================================================");
        System.out.printf("\n\tMultiplicação de matrizes");
        System.out.printf("\n\tDigite o tamanho para 2 matrizes validas para multiplicação");

        System.out.printf("\nmatrix 1: (ex 2 3 - 2x3)");
        a = input.nextInt();
        b = input.nextInt();
        matriz1 = new int[a][b];

        for(int i=0;i<a;i++) {
            for(int j=0;j<b;j++) {
                aux = input.nextInt();
                matriz1[i][j] = aux;
            } 
        }

        for(int i=0;i<a;i++) {
            for(int j=0;j<b;j++) {
                System.out.printf("[%d] ",matriz1[i][j]);
            } 
            System.out.println("");
        }

        System.out.printf("\n2: (ex 2 3 - 2x3)");
        a = input.nextInt();
        b = input.nextInt();
        if(matriz1[0].length != a) {
            System.out.println("Impossivel a matriz1 com a matriz2");
            input.close();
            return;
        }
        matriz2 = new int[a][b];
        for(int i=0;i<a;i++) {
            for(int j=0;j<b;j++) {
                aux = input.nextInt();
                matriz2[i][j] = aux;
            } 
        }

        for(int i=0;i<a;i++) {
            for(int j=0;j<b;j++) {
                System.out.printf("[%d] ",matriz2[i][j]);
            } 
            System.out.println("");
        }

        result = MatrixUtil.getMultiplyMatrix(matriz1, matriz2);

        System.out.println("O Resultado das multiplicação é:\n");
        for(int i=0;i<result.length;i++) {
            for(int j=0;j<result[0].length;j++) {
                System.out.printf("[%d] ",result[i][j]);
            } 
            System.out.println();
        }
        input.close();
    }   
}