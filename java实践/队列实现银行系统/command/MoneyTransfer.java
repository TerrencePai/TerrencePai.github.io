package command;
/**银行转账业务,用时7分钟*/
public class MoneyTransfer implements Order{
    public static final byte sustainTime=7;
	public MoneyTransfer(){
  		;
    }
   public void execute(){
    	System.out.println("正在转账。。。");
    }
}