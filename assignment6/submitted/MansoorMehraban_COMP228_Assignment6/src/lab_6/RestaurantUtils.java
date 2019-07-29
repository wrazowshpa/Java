package lab_6;

import java.util.List;

public abstract class RestaurantUtils {

	public static String getListOfCandy(List<String> candyList){
		String candyL = "";
		for(String candy : candyList){
			candyL += candy + " ";
		}
		return candyL;
	}
}
