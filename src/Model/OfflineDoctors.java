package Model;

import Model.Interfaces.Doctor;

public class OfflineDoctors implements Doctor {

    String docId;
    String docName;
    String docDegree;

    String docSpecialty;
    int docAge;

    public OfflineDoctors(String docId,String docName,String docDegree,String docSpecialty,int docAge){
        this.docId = docId;
        this.docName = docName;
        this.docDegree = docDegree;
        this.docSpecialty = docSpecialty;
        this.docAge = docAge;
    }

    @Override
    public void diagnosis(){
        System.out.println("Hey, I'm doing diagnosis")
    }

    public void getMyPatients(){

    }

    public void getMyDetails(){
        System.out.println("Hey I am Dr. "+ docName);
    }


}
