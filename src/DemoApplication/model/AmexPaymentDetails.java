package DemoApplication.model;

public class AmexPaymentDetails implements IPaymentDetails {
    String fromMobileNo;
    String toMobileNo;
    String pin;


    //egulor ki dorkar?

//    public String getFromMobileNo() {
//        return fromMobileNo;
//    }
//
//    public void setFromMobileNo(String fromMobileNo) {
//        this.fromMobileNo = fromMobileNo;
//    }
//
//    public String getToMobileNo() {
//        return toMobileNo;
//    }
//
//    public void setToMobileNo(String toMobileNo) {
//        this.toMobileNo = toMobileNo;
//    }
//
//    public String getPin() {
//        return pin;
//    }
//
//    public void setPin(String pin) {
//        this.pin = pin;
//    }

    @Override
    public String toString() {
        return "BkashPaymentDetails{" +
                "fromMobileNo='" + fromMobileNo + '\'' +
                ", toMobileNo='" + toMobileNo + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }

    public AmexPaymentDetails(String fromMobileNo, String toMobileNo, String pin) {
        this.fromMobileNo = fromMobileNo;
        this.toMobileNo = toMobileNo;
        this.pin = pin;
    }
}

