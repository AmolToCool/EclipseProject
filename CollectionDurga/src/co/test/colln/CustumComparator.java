package co.test.colln;

import java.util.Comparator;

public class CustumComparator implements Comparator<java.lang.Integer> {

	/*@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -1;
	}*/

	@Override
	public int compare(Integer i1, Integer i2) {
        if(i1<i2) {
        	return 1;
        }else if(i1>i2){
        	return -1;
        }
		return 0;
	}

}
