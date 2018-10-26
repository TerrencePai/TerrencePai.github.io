import java.io.*;
import java.util.*;
public Business{

private StringBuffer name;//业务名称
private byte id; //业务编号
private int time;//业务办理所需时间
Vector business=new Vector();
Business(){
	
}
private static businessFileWrite(){
file f=new File("Business.txt");
FileOutputStream fopen=new FileOutputStream(f);
OutputStreamWriter write=new OutputStreamWriter(fopen,"gbk");
write.append(this.id.toString()+this.name+this.time.toString()+"\n");
write.close();
}
private Business(StringBuffer name,byte id,int time){

this.name=name;
this.id=id;
this.time=time;
businessFileWrite();
}
private static businessFilerend(){

}
public StringBuffer getName(int id){
	return this.name;
}
public int getTime(int id){
	return this.time;
}

}