package medical_manage.models;

public abstract class MedicalRecord {
    private int id;
    private String medicalRecordCode;
    private String name;
    private String dayIn;
    private String dayOut;
    private String reasonIn;

    public MedicalRecord(int id, String medicalRecordCode, String name, String dayIn, String dayOut, String reasonIn) {
        this.id = id;
        this.medicalRecordCode = medicalRecordCode;
        this.name = name;
        this.dayIn = dayIn;
        this.dayOut = dayOut;
        this.reasonIn = reasonIn;
    }

    public MedicalRecord() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedicalRecordCode() {
        return medicalRecordCode;
    }

    public void setMedicalRecordCode(String medicalRecordCode) {
        this.medicalRecordCode = medicalRecordCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayIn() {
        return dayIn;
    }

    public void setDayIn(String dayIn) {
        this.dayIn = dayIn;
    }

    public String getDayOut() {
        return dayOut;
    }

    public void setDayOut(String dayOut) {
        this.dayOut = dayOut;
    }

    public String getReasonIn() {
        return reasonIn;
    }

    public void setReasonIn(String reasonIn) {
        this.reasonIn = reasonIn;
    }


    @Override
    public String toString() {
        return "id=" + id +
                ", medicalRecordCode='" + medicalRecordCode + '\'' +
                ", name='" + name + '\'' +
                ", dayIn='" + dayIn + '\'' +
                ", dayOut='" + dayOut + '\'' +
                ", reasonIn='" + reasonIn + '\'';
    }
}
