// Save as: SubmissionBlocker.java
public class SubmissionBlocker {
    public static void main(String[] args) {
        System.out.println("Processus Java lancé... en attente infinie.");
        while(true) {
            try { Thread.sleep(1000); } catch (Exception e) {}
        }
    }
}
