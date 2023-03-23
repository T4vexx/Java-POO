package progExs.MultMatrizes;

public class MatrixUtil {
    
    public static int[][] getMultiplyMatrix(int[][] m1, int[][] m2) {
        int[][] aux = new int[m1.length][m2[0].length];
        int somador=0;
        int i,j,k;

        for(i=0;i<m1.length;i++) {
            for(j=0;j<m2[0].length;j++) {

                aux[i][j] = 0;
                for(k=0;k<m2.length;k++) {
                    somador +=  m1[i][k] * m2[k][j];
                }
                aux[i][j] = somador;
                somador = 0;
            } 
        }

        return aux;
    } 
}
