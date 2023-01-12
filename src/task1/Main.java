package task1;
import static task1.Data.checkRegistration;
public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Data d1=new Data("kli_kli_19aH","24511Kkk","24511Kkk");
        checkRegistration(d1);
    }
}