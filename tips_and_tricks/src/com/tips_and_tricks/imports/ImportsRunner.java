package com.tips_and_tricks.imports;

import static java.lang.System.out;
import static java.util.Collections.sort;

import java.math.BigDecimal;
import java.util.ArrayList;
//import java.util.Collections;

public class ImportsRunner {

	public static void main(String[] args) {
		String str = "vishal";
		out.println(str); // print without System as we import System.out as static

		sort(new ArrayList<String>()); // now we can sort without calling it with Collections

		BigDecimal bg = null;

	}

}
