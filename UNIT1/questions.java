
// public class Employee{
//         int age;
//         String name;
//         public void work(){
//             System.err.println(name);
//         }
// }
//     class Manager extends Employee{
//         // String name = super(name);
//         @Override
//         public void work(){
//             super.work();
//             System.out.println("TASK");
//             // System.err.println(this.name);
//         }
//     }
// public static void main(String[] args) {
//     questions q1 = new questions();
//     questions.Employee e1 = q1.new Employee();
//     e1.name = "user1";
//     e1.age = 123;
//     e1.work();
//     questions.Manager m1 = q1.new Manager();
//     m1. name = "Hole";
//     m1.age=23;
//     m1.work();
// }
// }

// class questions {

    // class Student {

    //     private String name;
    //     private int id;
    //     private double marks;

    //     public Student(String name, int id, double marks) {
    //         this.name = name;
    //         this.id = id;
    //         setMarks(marks);
    //     }

    //     public String getName() {
    //         return name;
    //     }

    //     public void setMarks(double marks) {
    //         // this.name = name;
    //         if (marks < 0 || marks > 100) {
    //             System.out.println("Invalid");
    //             this.marks = 0;
    //         } else {
    //             this.marks = marks;
    //         }
    //     }

    //     public void setName(String name) {
    //         this.name = name;
    //     }

    //     // Getter for id
    //     public int getId() {
    //         return id;
    //     }

    //     // Setter for id
    //     public void setId(int id) {
    //         this.id = id;
    //     }
    // }

    //     public static void main(String[] args) {
    //         questions q1 = new questions();
    //         questions.Student s1 = q1.new Student("user1", 100, 23);
    //         System.out.println(s1.getName());
    //         System.out.println(s1.marks);
    //     }
    // }
// }

// class questions{
//     class Student{
//         int marks;
//         String name;
//         // public Student(int marks, String name){
//         //     System.out.println(name +"scored "+ marks);
//         // }
//         public void show(int marks, String name){
//             System.out.println(name +"scored "+ marks);
//         }
//     }
//     public static void main(String[] args) {
//         questions q1 = new questions();
//         questions.Student s1 = q1.new Student();
//         Scanner sc = new Scanner(System.in);
//         int markss = sc.nextInt();
//         String namee = sc.next();
//         // int 
//         s1.marks = markss;
//         s1.show(markss,namee); 
        
//     }
// }

// class questions{
//     class Book{
//         int id;
//         String title;
//         String author;
//         Boolean available;

//         public Book(int id, String title, String author, Boolean available){
//             this.id = id;
//             this.title = title;
//             this.author = author;
//             this.available = available;
//         }
//         public void display(int id, String title, String author, Boolean available){
//         System.out.println("ID: " + id + " | Title: " + title + " | Author: " + author + " | Available: " + available);
//         }
//     }
//      class Library{
//         ArrayList<Book> books = new ArrayList<>();
//         Scanner sc = new Scanner(System.in);

//         public void addBook(){
//              System.out.print("Enter Book ID: ");
//             int id = sc.nextInt();
//             sc.nextLine(); // consume newline
//             System.out.print("Enter Book Title: ");
//             String title = sc.nextLine();
//             System.out.print("Enter Author Name: ");
//             String author = sc.nextLine();

//             books.add(new Book(id, title, author, true));
//             System.out.println("Book added successfully!\n");
        
//         }
//     }
//     public static void main(String[] args) {
//         questions q = new questions();
//         questions.Library lib = q.new Library();

//         lib.addBook(); // try adding one book
//     }
// }

class questions{
        
}