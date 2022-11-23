package MidLab;
import java.util.*;
class VisaBuilder{
    String name;
    String gender;
    String purposeOfVisa;
    String nationality ;
    int age;

    Scanner sc = new Scanner(System.in);
    public void CollectData(){
    System.out.println("Visa Form");
    System.out.println("-----------------------");
    System.out.println("Enter your Name: ");
    name = sc.nextLine();
    
    System.out.println("Enter your Nationality: ");
    nationality = sc.nextLine();
     System.out.println("Enter your age: ");
    age = sc.nextInt();
    System.out.println("Enter your gender: ");
    gender = sc.nextLine(); 
    System.out.println("Enter purpose of visa: ");
    purposeOfVisa = sc.nextLine();
    VisaConcreatBuilder obj = new VisaConcreatBuilder(
    name,nationality,age,gender,purposeOfVisa);
    obj.creatVisa();
    }
    
    
}
class VisaConcreatBuilder{
    String name;
    String nationality ; 
    int age;
    String gender;
    String purposeOfVisa;
    BusniseVisa Bobj;
    StudyVisa Sobj;
    VisitVisa Vobj;
    VisaConcreatBuilder(String name,String nat, int age, String gender, String purpose ){
        this.name = name;
        this.nationality = nat;
        this.age = age;
        this.gender = gender;
        this.purposeOfVisa = purpose;
    }
    public void creatVisa(){
        if(this.purposeOfVisa.contentEquals("Business")){
               Bobj.creatVisa();
            
        }
        else if(this.purposeOfVisa.contentEquals("Study")){
               Sobj.creatVisa();
            
        }
        else if(this.purposeOfVisa.contentEquals("Visit")){
               Vobj.creatVisa();
            
        }
        else{
            System.out.println("You Chose Nothing ");
        }
    }
    
}
class BusniseVisa extends VisaConcreatBuilder {

    public BusniseVisa(String name,String nat, int age, String gender, String purpose) {
        super(name,nat, age, gender, purpose);
    }
    @Override
    public void creatVisa(){
        System.out.println("-------- This is Busnise Visa --------- ");
        System.out.println("Your Name is : "+super.name);
        System.out.println("Your Nationality is : "+super.nationality);
        System.out.println("Your Age is : "+super.age);
        System.out.println("Your Gender is : "+super.gender);  
        System.out.println("Your Purpose of Visa  is : "+super.purposeOfVisa);
        
    }
    
}
class StudyVisa extends VisaConcreatBuilder{
      public StudyVisa(String name,String nat, int age, String gender, String purpose) {
        super(name,nat, age, gender, purpose);
    }
    @Override
    public void creatVisa(){
        System.out.println("-------- This is Study Visa --------- ");
        System.out.println("Your Name is : "+super.name);
        System.out.println("Your Nationality is : "+super.nationality);
        System.out.println("Your Age is : "+super.age);
        System.out.println("Your Gender is : "+super.gender);  
        System.out.println("Your Purpose of Visa  is : "+super.purposeOfVisa);
        
    }
    
}
class VisitVisa extends VisaConcreatBuilder{
      public VisitVisa(String name,String nat, int age, String gender, String purpose) {
        super(name,nat, age, gender, purpose);
    }
    @Override
    public void creatVisa(){
        System.out.println("-------- This is Visit Visa --------- ");
        System.out.println("Your Name is : "+super.name);
        System.out.println("Your Nationality is : "+super.nationality);
        System.out.println("Your Age is : "+super.age);
        System.out.println("Your Gender is : "+super.gender);  
        System.out.println("Your Purpose of Visa  is : "+super.purposeOfVisa);
        
    }
    
}
class VisaDirector{ 
    VisaBuilder myobj = new VisaBuilder();
    public void requestVisa(){
    myobj.CollectData();
    }
    
}
public class Mylabmid {

    public static void main(String[] args) {
        System.out.println("Create Me A Visa ");
        VisaDirector obj = new VisaDirector();
        obj.requestVisa();
        
        
    }
    
}
