package command;
/**账户管理业务,用时5分钟*/
public class AccountManagement implements Order{
	public static final byte sustainTime=5;
	public AccountManagement(){
  		;
    }
   public void execute(){
    	System.out.println("正在管理。。。");
    }
}