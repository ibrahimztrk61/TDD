package customer;

import customer.exception.MailServerUnavaibleException;

public class InfoService {
    public void newRecordMailSend(Customer customer) {
        System.out.println("mail is sent");
    }

    public void mailServerException() { throw new MailServerUnavaibleException("Mail server has a error.");
    }

    public void deleteMailSend(Integer customerId) {
        System.out.println("Customer deleted mail is sent");
    }
}
