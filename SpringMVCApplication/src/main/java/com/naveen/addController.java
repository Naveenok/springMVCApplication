/**
 * 
 */
package com.naveen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author admin
 *
 */
@Controller
public class addController {
	@RequestMapping("/add")
	public void add() {
		System.out.println("hi");
	}
}
