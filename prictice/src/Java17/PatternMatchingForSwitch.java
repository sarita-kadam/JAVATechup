package Java17;

// 2. Pattern Matching for switch : No need for multiple instanceof checks.
//Pattern Matching for switch allows you to check type and cast in one step.


class TechnicalTicket {
    private String issue;

    public TechnicalTicket(String issue) {
        this.issue = issue;
    }

    public String getIssue() {
        return issue;
    }
}

class BillingTicket {
    private String billNumber;

    public BillingTicket(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getBillNumber() {
        return billNumber;
    }
}

public class PatternMatchingForSwitch {

    public static String processTicket(Object ticket) {

        return switch (ticket) {

            case TechnicalTicket t ->
                    "Technical issue: " + t.getIssue();

            case BillingTicket b ->
                    "Billing issue: " + b.getBillNumber();

            case null ->
                    "Ticket is null";

            default ->
                    "Unknown ticket type";
        };
    }

    public static void main(String[] args) {

        Object t1 = new TechnicalTicket("Server Down");
        Object t2 = new BillingTicket("INV123");

        System.out.println(processTicket(t1));
        System.out.println(processTicket(t2));


    }

}
