public class Main {
    public static void main(String[] args) {
      
        SchoolManagementApp attendanceAdapter = AdapterFactory.createAdapter("Attendance");
        SchoolManagementApp gradingAdapter = AdapterFactory.createAdapter("Grading");
        SchoolManagementApp libraryAdapter = AdapterFactory.createAdapter("Library");
        
        
        attendanceAdapter.integrateSystem();
        gradingAdapter.integrateSystem();
        libraryAdapter.integrateSystem();
    }
}
