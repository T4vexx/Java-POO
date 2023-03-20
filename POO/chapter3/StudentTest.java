public class StudentTest {
    
    public static void main(String[] args) {
        Student aluno1 = new Student("Otávio Augusto", 85.90);
        System.out.printf("A nota de %s foi: %s",aluno1.getName(),aluno1.getLetterGrade());
    }
}
