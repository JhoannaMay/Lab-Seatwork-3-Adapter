public class AttendanceSystemAdapter implements SystemInt {
    private AttendanceSystem attendanceSystem;

    public AttendanceSystemAdapter (AttendanceSystem attendanceSystem) {
        this.attendanceSystem = attendanceSystem;
    }
    public String integrateSystem() {
        return attendanceSystem.markAttendance();
    }
}
