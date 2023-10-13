package Model;

public class Hospital {
    String hospitalName;
    int totalBeds;
    String hospitalAddress;
    int hospitalPhoneNumber;

    public Hospital(String hospitalName,int totalBeds,String hospitalAddress,int hospitalPhoneNumber){
        this.hospitalName = hospitalName;
        this.totalBeds = totalBeds;
        this.hospitalAddress = hospitalAddress;
        this.hospitalPhoneNumber = hospitalPhoneNumber;
    }

    public void getHospitalName(){
        System.out.println(hospitalName);
    }

    public void getTotalBeds(){
        System.out.println(totalBeds);
    }

    public void getHospitalAddress(){
        System.out.println(hospitalAddress);
    }

    public void getPhoneNumber(){
        System.out.println(hospitalPhoneNumber);
    }

    public void getTotalPatients(){

    }

    public void getTotalDoctors(){

    }

    public void getPatientDetails(String pId){

    }

    public void getDoctorDetails(String dId){

    }

    public void admitPatient(String patientName, String patientIllness, int patientAge, String patientGender){

    }

    public void appointDoctor(String doctorName,int doctorAge,String doctorDegree,String doctorSpecialty){

    }
}
