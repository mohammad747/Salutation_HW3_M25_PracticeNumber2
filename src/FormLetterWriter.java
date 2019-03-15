/*
practice number 2
 */
/*
Written by: Mohammad Hashemi
Tuesday,March 12 2019
سه شنبه،21اسفند97
 */
public class FormLetterWriter {
    void displaySalutation(String customerLastNanme){
        System.out.print("Dear Mr. "+customerLastNanme+" ");
        System.out.println("thank you for your recent order.");
    }

    void displaySalutation(String firstName,String lastName){
        System.out.print("Dear "+firstName+" "+lastName+" ");
        System.out.println("thank you for your recent order.");
    }
}
