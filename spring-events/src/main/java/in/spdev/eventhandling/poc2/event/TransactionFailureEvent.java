package in.spdev.eventhandling.poc2.event;

import org.springframework.context.ApplicationEvent;

public class TransactionFailureEvent {
    private Long mobileNo;
    private double amount;

    public TransactionFailureEvent(Long mobileNo, double amount) {
        this.amount=amount;
        this.mobileNo=mobileNo;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
