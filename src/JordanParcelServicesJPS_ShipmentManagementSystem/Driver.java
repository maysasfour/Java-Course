package JordanParcelServicesJPS_ShipmentManagementSystem;

import java.util.Set;

public class Driver extends Person{
    private String licenseNumber;
    private int yearsOfExperience;
    private Set<String> languagesSpoken;


    public Driver(String name, String nationalID, String address) {
        super(name, nationalID, address);
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Set<String> getLanguagesSpoken() {
        return languagesSpoken;
    }

    public void setLanguagesSpoken(Set<String> languagesSpoken) {
        this.languagesSpoken = languagesSpoken;
    }

}
