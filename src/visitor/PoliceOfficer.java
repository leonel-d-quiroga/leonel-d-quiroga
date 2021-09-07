package visitor;

import java.util.List;

public class PoliceOfficer {
    public boolean visit(NationalPassenger passenger) {
        boolean checked=false;
        if(checkIdentification(passenger.getIdentityDocument()) && checkBelongings(passenger.getBelongings())) {
            checked=true;
        }

        return checked;
    }

    public boolean visit(InternationalPassenger passenger) {
        boolean checked=false;
        if(checkIdentification(passenger.getPassport()) && checkBelongings(passenger.getBelongings()) && passenger.getVisa()) {
            checked=true;
        }
        return checked;
    }

    private boolean checkBelongings(List<String> belongings) {
        return !belongings.contains("Liquids");
    }

    private boolean checkIdentification(String id) {
        return id!=null && !id.equals("");
    }

}
