package com.usp.kiss.server.service;

import org.slim3.tester.ServletTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class UpdateEpisodeServiceImplTest extends ServletTestCase {

    private UpdateEpisodeServiceImpl service = new UpdateEpisodeServiceImpl();

    @Test
    public void test() throws Exception {
        assertThat(service, is(notNullValue()));
    }
}
