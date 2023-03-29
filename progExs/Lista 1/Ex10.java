import java.util.Scanner;

public class Ex10 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,aux,flag=0,number=0;
        int[][] matriz1;

        System.out.printf("Infor a ordem da matrix quadrada: \n");
        a = input.nextInt();
        matriz1 = new int[a][a];

        for(int i=0;i<a;i++) {
            for(int j=0;j<a;j++) {
                aux = input.nextInt();
                matriz1[i][j] = aux;
            } 
        }

        for(int i=0;i<a;i++) {
            aux=0;
            for(int j=0;j<a;j++) {
                aux += matriz1[i][j];
                if(i!=0) {
                    if(aux!=number && j==(a-1)) {
                        flag = 1;
                    }
                }
            } 
            if(i==0) {
                number = aux;
            }
        }

        for(int i=0;i<a;i++) {
            aux=0;
            for(int j=0;j<a;j++) {
                aux += matriz1[j][i];
                if(aux!=number && j==(a-1)) {
                    flag = 1;
                }
            } 
        }

        aux=0;
        for(int i=0;i<a;i++) {
            aux += matriz1[i][i];
        }
        if(aux!=number) {
            flag = 1;
        }

        aux=0;
        for(int i=0;i<a;i++) {
            aux += matriz1[(a-1)-i][i];
        }
        if(aux!=number) {
            flag = 1;
        }

        if(flag==1) {
            System.out.println("A matriz 1 não é um quadrado magico");
        } else {
            System.out.println("A matriz 1 é um quadrado magico");
        }

        input.close();
    }
}
