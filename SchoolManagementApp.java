public class SchoolManagementApp {

        public static void Main(String[] arg){
            
            AttendanceSystem attendanceSystem = new AttendanceSystem ();
            SystemInt attendanceAdapt= new AttendanceSystemAdapter(attendanceSystem);
            GradingSystem gradingSystem = new GradingSystem();
            LibrarySystem librarySystem = new LibrarySystem();
    
            
    
        
    
        }
    }

