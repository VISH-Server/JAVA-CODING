import java.util.Vector;

class Customer {
    private int custId;
    private String custName;
    private int shoppingPoints;
    private int feedbackRating;

    public Customer(int custId, String custName, int feedbackRating) throws InvalidFeedbackRating {
        this.custId = custId;
        this.custName = custName;
        this.feedbackRating = feedbackRating;
        this.shoppingPoints = 1; // initialized to 1
        if (feedbackRating < 1 || feedbackRating > 5) {
            throw new InvalidFeedbackRating("Invalid feedback rating provided.");
        }
    }

    public int getCustId() {
        return custId;
    }

    public String getCustName() {
        return custName;
    }

    public int getShoppingPoints() {
        return shoppingPoints;
    }

    public int getFeedbackRating() {
        return feedbackRating;
    }

    public void shopAgain() {
        shoppingPoints++;
    }
}

class InvalidFeedbackRating extends Exception {
    public InvalidFeedbackRating(String message) {
        super(message);
    }
}

class CustomerNotFound extends Exception {
    public CustomerNotFound(String message) {
        super(message);
    }
}

class CustomerManagementApp {
    public Vector<Customer> custList = new Vector<>();

    public void addCustomer(Customer customer) {
        custList.add(customer);
    }

    public boolean searchCustomerByName(String customerName) throws CustomerNotFound {
        for (Customer customer : custList) {
            if (customer.getCustName().equals(customerName)) {
                return true;
            }
        }
        throw new CustomerNotFound("Customer not found.");
    }

    public int getTotalCustomerCount() {
        return custList.size();
    }

    public float calculateAverageFeedbackRating() {
        int totalFeedback = 0;
        for (Customer customer : custList) {
            totalFeedback += customer.getFeedbackRating();
        }
        return (float) totalFeedback / custList.size();
    }

    public Customer getCustomerWithHighestShoppingPoints() {
        Customer maxCustomer = custList.get(0);
        for (Customer customer : custList) {
            if (customer.getShoppingPoints() > maxCustomer.getShoppingPoints()) {
                maxCustomer = customer;
            }
        }
        return maxCustomer;
    }

    public static void main(String[] args) {
        CustomerManagementApp ref = null;
        try {
            Customer cust1 = new Customer(101, "Sameer", 4);
            Customer cust2 = new Customer(102, "Radhika", 3);
            Customer cust3 = new Customer(103, "Kanika", 2);
            Customer cust4 = new Customer(104, "RamNarayan", 5);
            ref = new CustomerManagementApp();
            cust2.shopAgain();
            cust2.shopAgain();
            cust3.shopAgain();
            cust4.shopAgain();
            ref.addCustomer(cust1);
            ref.addCustomer(cust2);
            ref.addCustomer(cust3);
            ref.addCustomer(cust4);
        } catch (InvalidFeedbackRating e1) {
            e1.printStackTrace();
        }

        try {
            System.out.println("Search result is:" + ref.searchCustomerByName("Kanika"));
        } catch (CustomerNotFound e) {
            e.printStackTrace();
        }

        System.out.println("We have total " + ref.getTotalCustomerCount() + " customers in record.");
        System.out.println("Average feedback rating given by customers is: " + ref.calculateAverageFeedbackRating());
        Customer cust = ref.getCustomerWithHighestShoppingPoints();
        System.out.println("Customer ID =" + cust.getCustId() + " has scored the highest shopping points.");
    }
}
