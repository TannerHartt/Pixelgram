package com.cognizant.capybarasfems.Config;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import org.eclipse.jetty.http.HttpStatus;

import java.io.IOException;

import static java.nio.charset.Charset.defaultCharset;
import static org.springframework.util.StreamUtils.copyToString;

public class PostMocks {
    public static void setupMockPostResponse(WireMockServer mockServer) throws IOException {
        mockServer.stubFor(WireMock.get(WireMock.urlEqualTo("/posts"))
        .willReturn(WireMock.aResponse()
        .withStatus(HttpStatus.OK_200)
        .withHeader("Content-Type", "application/json")
        .withBody(
                copyToString(PostMocks.class.getClassLoader().getResourceAsStream("get-posts-response.json"), defaultCharset())
        )));
    }
}
