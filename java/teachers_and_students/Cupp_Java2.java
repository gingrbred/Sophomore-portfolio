public class Cupp_Java2 {
public static void main(String[] args) {
      Student bob = new Student();
      Student joe = new Student();
      Student matt = new Student();
      Student billy = new Student();
      Student alex = new Student();
      Teacher davis = new Teacher();
      Teacher bekar = new Teacher();
      Teacher pope = new Teacher();
      Teacher heagren = new Teacher();
      Teacher daggett = new Teacher();
      bob.setname("Bob");
      joe.setname("Joe");
      matt.setname("Matthew");
      davis.setsurname("Mr. Davis");
      bekar.setsurname("Mr. Bekar, but my friends call me Gurkan");
      pope.setsurname("Mr. Pope");
      heagren.setsurname("Mr.Heagren");
      daggett.setsurname("Mrs. Daggett");
      billy.setname("Billy-Joe Cletus Jr the fourth");
      alex.setname("Alexander");
      davis.setyears(13);
      bekar.setyears(15);
      pope.setyears(20);
      heagren.setyears(17);
      daggett.setyears(16);
      bob.setotherdetail("I like icecream and walks on the beach");
      joe.setotherdetail("I like coffee and summer sausage");
      matt.setotherdetail("I have red hair");
      billy.setotherdetail("I like to wrestle crocodiles");
      alex.setotherdetail("I have 11 toes");
      davis.setsubject("Pre-AP CS");
      bekar.setsubject("AP World History");
      pope.setsubject("Latin");
      heagren.setsubject("Pre-AP Geometry");
      daggett.setsubject("Digital Arts & Media");
      davis.PrintTeacherInfo();
      bekar.PrintTeacherInfo();
      pope.PrintTeacherInfo();
      heagren.PrintTeacherInfo();
      daggett.PrintTeacherInfo();
      bob.setage(12);
      joe.setage(15);
      matt.setage(16);
      billy.setage(20);
      alex.setage(13);
      bob.PrintInfo();
      joe.PrintInfo();
      matt.PrintInfo();
      billy.PrintInfo();
      alex.PrintInfo();
   }
static class Teacher{
//teachers tenure, name, and subject
int years;
String surname;
String subject;

void setyears(int years){
    this.years = years;
}
void setsurname(String surname){
    this.surname = surname;
}
void setsubject(String subject){
    this.subject = subject;
}
int getyears(){
    return this.years;
}
String getsurname(){
    return this.surname;
}
String getsubject(){
    return this.subject;
}
void PrintTeacherInfo(){
    System.out.printf("Hello, my name is %s. ", this.getsurname());
    System.out.printf("I teach %s. ", this.subject);
    System.out.printf("I have been teaching for %d years. \n", this.getyears());
}
}
static class Student{
//students age, name, and interesting fact
int age;
String name;
String otherdetail;


void setname(String BewareTheJabberWocky){ 
    this.name = BewareTheJabberWocky;
}
String getname(){
    return this.name;
}
void setotherdetail(String s){
    this.otherdetail = s;
}
String getotherdetail(){
    return this.otherdetail;
}
void setage(int alter){
    this.age = alter;
}
int getage(){
    return this.age;
}
void PrintInfo(){
    System.out.printf("My name is %s. ", this.getname());
    System.out.printf("A fun fact about me is %s. ", this.getotherdetail());
    System.out.printf("I am %d years old. \n", this.getage());
}
}
}