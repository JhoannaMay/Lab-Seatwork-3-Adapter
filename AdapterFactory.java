public class AdapterFactory {
    public static SchoolManagementApp createAdapter(String systemType) {
        switch (systemType) {
            case "Attendance":
                return new AttendanceSystemAdapter(new AttendanceSystem());
            case "Grading":
                return new GradingSystemAdapter(new GradingSystem());
            case "Library":
                return new LibrarySystemAdapter(new LibrarySystem());
            default:
                throw new IllegalArgumentException("Unknown system type");
        }
    }
}
