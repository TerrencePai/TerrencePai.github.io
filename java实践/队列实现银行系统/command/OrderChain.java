package command;
/** 业务链：可以添加要执行的业务并执行*/
/** 调用示例 
OrderChain orderchain=new OrderChain();
orderchain.addaddorder(new Order()).addaddorder(new Order()).addaddorder(new Order())...;
*/
import java.util.*;
public class OrderChain{
	User user;
	byte windowIndex;
	long needTime;
 	// public OrderChain(User user){
  //     this.user=user;
 	// }

	List<Order> orders=new ArrayList<Order>();
	// 这种返回自身对象的做法可以方便链条式调用
	public OrderChain addorder(Order order){
		this.orders.add(order);
		this.needTime+=order.sustainTime;
		return this;
	}
	public void execute(){
		for(Order order:orders){
              order.execute();
		}
	}
}