import java.time.*;
class LateSubmissionException extends Exception { LateSubmissionException(String m){super(m);} }
class InvalidFileFormatException extends Exception { InvalidFileFormatException(String m){super(m);} }
class Exam {
    void submitExam(String file, LocalDateTime time) throws Exception {
        LocalDateTime deadline = LocalDateTime.of(2025,11,3,12,0);
        if (!file.endsWith(".pdf")) throw new InvalidFileFormatException("Submission failed: invalid file format");
        if (time.isAfter(deadline)) throw new LateSubmissionException("Submission failed: late submission");
        System.out.println("Submission successful");
    }
    public static void main(String[] args) {
        Exam e = new Exam();
        try { e.submitExam("answer.docx", LocalDateTime.now()); }
        catch (Exception ex) { System.out.println(ex.getMessage()); }
    }
}
