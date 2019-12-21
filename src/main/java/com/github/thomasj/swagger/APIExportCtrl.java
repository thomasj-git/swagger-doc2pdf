package com.github.thomasj.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author stantnks@gmail.com
 */
@Controller
public class APIExportCtrl {

	@Value ("${swagger.api-docs:v2/api-docs}")
	private String swaggerDocs;

	@GetMapping ("/api-export")
	public String apiExport (Model model) {
		model.addAttribute("swaggerDocs", swaggerDocs);
		return "api-export-angular";
	}
}
