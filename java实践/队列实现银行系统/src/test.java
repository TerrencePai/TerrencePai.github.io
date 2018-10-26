import java.io.*;
 
public class test{
    public static void main(String args[]) throws IOException {
        // char c;
        // // 使用 System.in 创建 BufferedReader
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("输入字符, 按下 'q' 键退出。");
        // // 读取字符
        // do {
        //     c = (char) br.read();
        //     System.out.println(c);
        // } while (c != 'q');
try(FileReader fr=new FileReader("../txt/Business.txt"))//自动关闭非内存资源
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringBuffer str=(str)br.readln();
System.out.println(str);
}
catch(){
    ;
}
finally{
；  
}
    }
}
}
}