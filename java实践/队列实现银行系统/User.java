import command;
public class User{
    private static byte index;//用户编号
	public User(){
   		this.index++;
	}

	private Windows windows;//用户办理业务的窗口
    private OrderChain oc;//用户要办理的业务链 

	public OrderChain getOrderChain(){
		return this.oc;
	}
	public void setOrderChain(OrderChain oc){
		this.oc=oc;
	}    
    public Windows getWindows(){
    	return this.windows;
    }
    public Void setWindows(Windows windows){
    	this.windows=windows;
    }
 
}