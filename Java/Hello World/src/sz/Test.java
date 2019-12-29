package sz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String[] args){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        while (true){
            try{
                s=br.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }
            if(s.equals("e")||s.equals("E"))
                break;
            else
                System.out.println(s.toUpperCase());//Ìí¼Ó×¢ÊÍ
        }
    }
}
