package com.example.myrestapi.demo;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void aboutShouldReturnDefaultMessage() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/about",
                String.class)).contains("Fishing Diary server.");
    }

    @Test
    public void whenGetUsers_thenReturnData() throws Exception {

        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/user",
                String.class)).contains("\"etunimi\":\"Teddy\"");
    }

    @Test
    public void whenGetTrips_thenReturnData() throws Exception {

        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/trip",
                String.class)).contains("\"paikka\":\"Längelmävesi\"");
    }

    @Test
    public void whenGetTripsById_thenReturnData() throws Exception {

        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/trip/1",
                String.class)).contains("\"paikka\":\"Längelmävesi\"");
    }

    @Test
    public void whenGetCatches_thenReturnData() throws Exception {

        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/catch",
                String.class)).contains("\"viehe\":\"Salmo hornet\"");
    }
}
