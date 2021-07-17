package com.javatechnology;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Matchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
class ReadinglistApplicationTests {

	@Test
	void contextLoads() {

	}

	@Autowired
	private WebApplicationContext webContext;
	//@Autowired
	private MockMvc mockMvc;

	// @Before
	public void setupMockMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webContext).build();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void homePage() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/reader"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.view().name("readingList"))
				.andExpect(MockMvcResultMatchers.model().attributeExists("books"));
				//.andExpect(MockMvcResultMatchers.model().attribute("books", Matchers.is(Matchers.empty())));
	}

}
