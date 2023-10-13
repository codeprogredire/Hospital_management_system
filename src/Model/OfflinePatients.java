package Model;

import Model.Interfaces.Patient;

public class OfflinePatients implements Patient {
    String pId;
    String patientName;
    String patientIllness;
    String patientGender;
    int bedNumber;

    public OfflinePatients(String pId,String patientName,String patientIllness,String patientGender,int bedNumber){
        this.pId = pId;
        this.patientName = patientName;
        this.patientIllness = patientIllness;
        this.patientGender = patientGender;
        this.bedNumber = bedNumber;
    }

    public void getMyDetails(){

    }
    public void getMyBedNumber(){

    }

    public void assignMeDoctor(){

    }
}
