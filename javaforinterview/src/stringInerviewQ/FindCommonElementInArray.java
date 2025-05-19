package stringInerviewQ;

import java.util.ArrayList;
import java.util.List;

public class FindCommonElementInArray {

	public static void main(String[] args) {
		
		
		Integer c[]={10,20,30,40,50};
		Integer d[]={30,40,50,60,70};
		List<Integer>common=new ArrayList();
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<d.length;j++) {
				if(c[i]==d[j]) {
					common.add(c[i]);
				}
			}
		}
		
System.out.println(common);
	}

}
