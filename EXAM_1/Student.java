public class student {
    String surname;
    String firstName;
    String middleInitial;
    String dateOfBirth;
    String StudentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;
    

    public student (String srn, String frn, String mdi, String dob, String sdn, String sde, boolean amIAwesome) {
        surname = srn;
        firstName = frn;
        middleInitial = mdi;
        dateOfBirth = dob;
        StudentNumber = sdn;
        studentEmailAddress = sde;
        iAmAwesome = amIAwesome;
    }

    public void sayMyStudentNumber() {
        System.out.println("My Student Number is " + StudentNumber);
    }

    public void sayMystudentEmailAddress() {
        System.out.println("My Email Address is " + studentEmailAddress);
    }

    public void sayMyamIAwesome() {
        System.out.println("i am awesome " + iAmAwesome);
    }
}
