import java.util.ArrayList;
public class ClassSection {
    private String subject;
    private int capacity;
    public int yearLevel;
    public ArrayList <Student> students = new ArrayList();
    public ClassSection(String subject, int capacity, int yearLevel){
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getYearLevel(){
        return yearLevel;
    }
    public void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }
    public ArrayList getStudents(){
        return students;
    }
    public void addStudent(Student student){
        for (int i = 0; i < students.size(); i++){
            if (students.get(i) == student){
                return;
            }
        }
        if (student.getYearLevel() == this.yearLevel){
            students.add(student);
        }
    }
    public void removeStudent(Student student){
        for (int i = 0; i < students.size(); i++){
            if (students.get(i) == student){
                students.remove(i);
            }
        }
    }
    public boolean isStudentEnrolled(Student student){
        for (int i = 0; i < students.size(); i++){
            if (students.get(i) == student){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return "ClassSection{subject='" + subject + "', capacity=" + capacity + ", yearLevel=" + yearLevel + ", students=" + students + "}";
    }

}
