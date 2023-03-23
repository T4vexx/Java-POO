package progExs.hierarquia;

public class Exercicio2 {

    public static void main(String[] args) {
        Integer intObj = new Integer(123);
        Long longObj = new Long(1234567890);
        Double doubleObj = new Double(12.345);
        Boolean boolObj = new Boolean(true);
        Object[] objArray = {intObj,longObj,doubleObj,boolObj};

        for(int i=0;i<objArray.length;i++) {
            if(objArray[i] instanceof Number) {
                System.out.println(objArray[i].toString() + " é um Number");
            } else {
                System.out.println(objArray[i].toString() + " Não é um Number");
            }
        }
    }
}
