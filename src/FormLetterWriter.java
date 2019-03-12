public class FormLetterWriter {
    void displaySalutation(String customerLastNanme){
        System.out.print("Dear Mr. "+customerLastNanme+" ");
        System.out.println("Thank you for your recent order");
    }

    void displaySalutation(String firstName,String lastName){
        System.out.print("Dear "+firstName+" "+lastName+" ");
        System.out.println("Thank you for your recent order");
    }
}
