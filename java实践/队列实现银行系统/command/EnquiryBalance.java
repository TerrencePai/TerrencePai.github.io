package command;
/**余额查询，用时4分种*/
public class EnquiryBalance implements Order{
	public static final byte sustainTime=4;
	public EnquiryBalance(){
  		;
    }
     public void execute(){
    	System.out.println("正在查询。。。");
    }
}