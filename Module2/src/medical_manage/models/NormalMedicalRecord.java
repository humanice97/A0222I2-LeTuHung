package medical_manage.models;

public class NormalMedicalRecord extends MedicalRecord {
    private double hospitalCosts;

    public NormalMedicalRecord(int id, String medicalRecordCode, String name, String dayIn, String dayOut, String reasonIn, double hospitalCosts) {
        super(id, medicalRecordCode, name, dayIn, dayOut, reasonIn);
        this.hospitalCosts = hospitalCosts;
    }

    public NormalMedicalRecord() {
    }

    public double getHospitalCosts() {
        return hospitalCosts;
    }

    public void setHospitalCosts(double hospitalCosts) {
        this.hospitalCosts = hospitalCosts;
    }

    @Override
    public String toString() {
        return "NormalMedicalRecord{" + super.toString() +
                "hospitalCosts=" + hospitalCosts +
                "} ";
    }
}
