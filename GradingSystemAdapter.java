public class GradingSystemAdapter implements SystemInt {
    private GradingSystem gradingSystem;

    public GradingSystemAdapter (GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }
    public String integrateSystem() {
        return gradingSystem.recordGrades();
    }
}
