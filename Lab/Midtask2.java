package Lab;

public class Midtask2 { 

    public static void main(String[] args) {
    
    // 1.Combine first and last name
    String firstName = "Proyash" ;
    String lastName = "Noor" ;
    String fullName = firstName + " " + lastName;
    System.out.println("Full Name : " + fullName );
    
    // 2.Generate product code (product name + Id)
    String productName = "Laptop" ;
    int productId = 1234 ;
    String productCode = productName + " " + productId;
    System.out.println("Product Code : " + productCode);
    
    // 3.Extract username from email
    String email = "student.aiub@gmail.com";
    String username = email.substring(0, email.indexOf("@"));
    System.out.println("Username : " + username);

    // 4.Count totalnumber of characters in a message 
    String message = "Hello, how are you?";
    int length = message.length();
    System.out.println("Message Length : " + length + " characters");

    // 5.Convert to upper and lower case 
    String sentence = "Hello! universe.";
    System.out.println("Uppercase : " + sentence.toUpperCase());
    System.out.println("Lowercase : " + sentence.toLowerCase());
    
    // 6.Replace a specific word in asentence
    String text = " Hello! world . ";
    String replacedText = text.replace("world","universe");
    System.out.println(" After Replace " + replacedText);

    }
}
