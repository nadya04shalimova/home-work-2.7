package task1;

public class Data {
    private final String login;
    private final String password;
    private final String confirmPassword;

    static final String reg="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[ ]).{1,20}$";




    public Data(String login,String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin(){ return login;}

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public  static boolean checkRegistration(Data data) throws WrongLoginException,WrongPasswordException{
        if (data.login.matches(reg)&&!data.login.isBlank()){
            System.out.println("Логин соответствует формату");
        }else {
            throw new WrongLoginException("Неверный формат логина");
        }
        if (data.password!=null&&!data.password.isBlank()&&data.getPassword().matches(reg)&& data.getPassword().equals(data.getConfirmPassword())) {
            System.out.println("Пароль введены корректно");
        }else {
            throw new WrongPasswordException("Неверный формат пароля/пароли не совпадают");
        }
        return false;
    }
}
