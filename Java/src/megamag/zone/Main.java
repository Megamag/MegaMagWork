package megamag.zone;

import static java.lang.System.out;

import java.util.ArrayList;

import static java.lang.System.err;

public class Main
{
	static ArrayList<String> list = new ArrayList<String>();
	
	public static void main(String[] args)
	{
		err.println(list.size());
		list.add("Yaacov Rozenbaum 052-3473312");
		err.println(list.size());
		out.println(list.get(0));
	}
}