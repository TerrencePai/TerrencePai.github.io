import java.util.*;
import java.text.*;

public class User{

private static int id;//用户编号
private static Date sharedDate=new Date();
private String arriveDate;//用户到达时间
private  long sustain ;//用户办理业务所需时间
private [] byte;//用户所需办理业务对应的编号
private byte window;//用户办理业务的窗口
public user(){
	this.id++;
	Date  date=new Date();
	SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    this.arrivedate=ft.format(date);
}

}