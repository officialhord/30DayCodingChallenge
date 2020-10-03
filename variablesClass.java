class Student{

int a;
static int id = 35;

void change(){
    
    System.out.println(id);
}


}

public class variablesClass{
    public static void main(String [] args){

        Student student1 = new Student();
        Student student2 = new Student();

        student1.change();
        Student.id = 2;

        student2.change();
    }
}