package command;
/**办理信用卡，用时2分钟*/
public class CreateCreditcard implements Order{
	public static final byte sustainTime=2;
	public CreateCreditcard(){
  		;
    }
    public void execute(){
    	System.out.println("正在办卡。。。");
    }
}