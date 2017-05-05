package org.shop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转controller
 */
@Controller
public class PageController {

	/**
	 * 打开首页
	 */
	@RequestMapping("/shop")
	public String showIndex() {
		return "index";
	}

	/**
	 * 展示其他页面
	 * <p>
	 * Title: showpage
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showpage(@PathVariable String page) {
		return page;
	}
}
