package com.usp.kiss.server.service;

import org.slim3.tester.ServletTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SearchGamesServiceImplTest extends ServletTestCase {

    private SearchGamesServiceImpl service = new SearchGamesServiceImpl();

    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }
}
