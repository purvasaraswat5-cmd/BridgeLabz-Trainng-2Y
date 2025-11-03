import java.io.*;
class InvalidStudentException extends Exception { InvalidStudentException(String m){super(m);} }
class ExamSystem {
    void validateStudent(String id) throws InvalidStudentException {
        if (!id.equals("S123")) throw new InvalidStudentException("Invalid student ID");
    }
    void submitExam(String id) throws IOException, InvalidStudentException {
        validateStudent(id);
        throw new IOException("File upload error");
    }
    public static void main(String[] args) {
        ExamSystem e = new ExamSystem();
        try { e.submitExam("S001"); }
        catch (IOException | InvalidStudentException ex) { System.out.println(ex.getMessage()); }
        finally { System.out.println("Exam submission process completed."); }
    }
}
