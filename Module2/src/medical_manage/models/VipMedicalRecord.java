package medical_manage.models;

public class VipMedicalRecord extends MedicalRecord {
    String vipType;
    String vipDuration;

    public VipMedicalRecord(int id, String medicalRecordCode, String name, String dayIn, String dayOut, String reasonIn, String vipType, String vipDuration) {
        super(id, medicalRecordCode, name, dayIn, dayOut, reasonIn);
        this.vipType = vipType;
        this.vipDuration = vipDuration;
    }

    public VipMedicalRecord() {
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public String getVipDuration() {
        return vipDuration;
    }

    public void setVipDuration(String vipDuration) {
        this.vipDuration = vipDuration;
    }

    @Override
    public String toString() {
        return "VipMedicalRecord{" + super.toString() +
                "vipType='" + vipType + '\'' +
                ", vipDuration='" + vipDuration + '\'' +
                "} ";
    }
}
