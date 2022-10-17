package com.lloyds;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
public class HumanFriendlyTimeApplicationTests {

    private HumanFriendlyTimeApplication humanFriendlyTimeApplication;

    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setup() {
        humanFriendlyTimeApplication = new HumanFriendlyTimeApplication();
    }

    @Test
    public void givenNumericTime_shouldReturnHumanFriendlyTime() throws Exception {
        mockMvc.perform(get("/time/human-friendly/10:30"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk())
                .andExpect(content().string("Half past ten"));
    }

    @Test
    public void givenNoTime_shouldReturnHumanFriendlyTimeFromSystemTime() throws Exception {
        mockMvc.perform(get("/time/human-friendly"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk());
    }
}
