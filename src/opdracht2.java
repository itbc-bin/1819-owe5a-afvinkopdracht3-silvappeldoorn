public class opdracht2 {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[1]);
        int n2 = Integer.parseInt(args[3]);
        int n3 = Integer.parseInt(args[5]);
        int n4 = Integer.parseInt(args[7]);

        Student stud1 = new Student(args[0],n1);

        Student stud2 = new Student(args[2],n2);

        Student stud3 = new Student(args[4],n3);

        Student stud4 = new Student(args[6],n4);
        stud1.info();
        stud2.info();
        stud3.info();
        stud4.info();


    }

}
