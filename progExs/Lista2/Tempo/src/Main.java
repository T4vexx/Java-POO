public class Main {
    public static void main(String[] args) {
        Tempo temp1 = new Tempo(10, 5, 30);
        Tempo temp2 = new Tempo(5, 17, 8);
        temp1.subtractTwoDates(temp1,temp2);
        System.out.println(temp1.getFormattedHour());
        System.out.println(temp2.getFormattedHour());
    }
}