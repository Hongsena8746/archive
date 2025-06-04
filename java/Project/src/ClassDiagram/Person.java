package ClassDiagram;
import java.util.Vector;

public class Person {
	private Phone homePhone;
    private Phone officePhone;
	
    public void setHomePhone(Phone phone) {
        this.homePhone = phone;
    }

    public void setOfficePhone(Phone phone) {
        this.officePhone = phone;
    }

    public Phone getHomePhone() {
        return homePhone;
    }

    public Phone getOfficePhone() {
        return officePhone;
    }

}