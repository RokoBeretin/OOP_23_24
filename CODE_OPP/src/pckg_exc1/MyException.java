package pckg_exc1;

import java.util.Map;

public class MyException extends Exception{
    private String msg;
    public MyException(String msg){
        this.msg = msg;
    }
    public void provideMyExceptioninfo(){
        System.out.println(msg);

    }
}
