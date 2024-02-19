public class Q7 {
    public static void main(String[] args) {
        Student [] allStudents=new Student[5];
        Student student1=new Student(1,"Ali",7);
        Student student2=new Student(2,"Ahmed",8);
        allStudents[0]=student1;
        allStudents[1]=student2;
        for (int i = 0; i <allStudents.length ; i++) {
            System.out.println(allStudents[i]);
        }
    }
}