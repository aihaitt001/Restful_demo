package testRestful.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/*
 * @author djb
 * 1. 尝试采用REST风格。
 * 
 */
@Controller
@RequestMapping("/artcles")
public class ArtcleController {

	/*
	 * 列出所有的文章
	 */
	@SuppressWarnings("null")
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listArtcles(ModelAndView mav) {
		System.out.println("listArtcles");

		List<Artcle> artcles = null;
		Artcle artcle = new Artcle();
		artcle.setArtcleId(1);
		artcle.setAuthor("djb");
		artcle.setBody("body");
		// artcle.setCreateTime(createtime);
		artcle.setTags("tags");
		artcle.setTitle("title");
		artcles.set(0, artcle);

		mav.addObject("artcles", artcles);
		mav.setViewName("listArtcles.html");
		return mav;
	}

	/*
	 * 获得artcleId相应的文章
	 */
	@RequestMapping(value = "/{artcleId}", method = RequestMethod.GET)
	public ModelAndView getArtcleByArtcleId(@PathVariable Integer artcleId, ModelAndView mav) {
		System.out.println("getArtcleByArtcleId");

		Artcle artcle = new Artcle();
		artcle.setArtcleId(1);
		artcle.setAuthor("djb");
		artcle.setBody("body");
		// artcle.setCreateTime(createtime);
		artcle.setTags("tags");
		artcle.setTitle("title");

		mav.addObject("artcle", artcle);
		mav.setViewName("artcle.html");

		return mav;

	}

	/*
	 * 文章修改
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT)
	public String updateArtcleByArtcleId(@RequestBody Artcle artcle, ModelAndView mav) {
		System.out.println("updateArtcleByArtcleId");
		System.out.println(artcle);
		return "success";
	}

	/*
	 * 删除文章
	 */
	@ResponseBody
	@RequestMapping(value = "/{artcleid}", method = RequestMethod.DELETE)

	public String deleteArtcleByArtcleId(@PathVariable Integer artcleid) throws IOException {
		System.out.println("deleteArtcleByArtcleId:" + artcleid);

		return "success";

	}
}
