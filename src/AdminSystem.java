public class AdminSystem extends Admin{

    public AdminSystem(){
        username = "hamadullah";
        pin = 2171;
    }

    @Override
    public boolean login(String user , int pass) {
        if(username.equals(user) && pin == pass){
                return true;
        }
        else {
            return false;
        }
    }
}
